package DZ6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WeatherDAO {
    protected String dbHost = "localhost";
    protected String dbPort = "3306";
    protected String dbUser = "root";
    protected String dbPass = "12345";
    protected String dbName = "weather";

    public void insert(List<WeatherDTO> weatherDTO) {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass)) {
            try (PreparedStatement prepInsert = dbConnection.prepareStatement("insert into weathersp(date, description,temperature) values (?,?,?)")) {
                for (int i = 0; i < weatherDTO.size(); i++) {
                    prepInsert.setString(1, weatherDTO.get(i).getLocalDate());
                    prepInsert.setString(2, weatherDTO.get(i).getWeatherText());
                    prepInsert.setDouble(3, weatherDTO.get(i).getTemperature());
                    prepInsert.addBatch();
                }
                prepInsert.executeBatch();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<WeatherDTO> getWeather() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        try (Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass)) {
            try (PreparedStatement prepSelect = dbConnection.prepareStatement("select * from weathersp")) {

                ResultSet select = prepSelect.executeQuery();
                List<WeatherDTO> list = new ArrayList<>();
                while (select.next()) {
                    String date = select.getString("date");
                    String description = select.getString("description");
                    Double temperature = select.getDouble("temperature");
                    WeatherDTO weatherDTO = new WeatherDTO("Saint-Petersburg", date, description, temperature);
                    list.add(weatherDTO);
                }
                return list;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

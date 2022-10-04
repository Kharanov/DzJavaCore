package DZ6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    WeatherProvider weatherProvider = new YandexWeatherProvider();
    WeatherDAO weatherDAO = new WeatherDAO();
    Map<Integer, Functionality> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, Functionality.GET_WEATHER_FROM_YANDEX);

        variantResult.put(2, Functionality.GET_WEATHER_FROM_DB);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key" + command);
        }
        List<WeatherDTO> weatherDTOS = new ArrayList<>();
        if (variantResult.get(command) == Functionality.GET_WEATHER_FROM_YANDEX) {

            weatherDTOS = weatherProvider.getWeather();
            weatherDAO.insert(weatherDTOS);

        } else if (variantResult.get(command) == Functionality.GET_WEATHER_FROM_DB) {
            weatherDTOS = weatherDAO.getWeather();
        }
        for (int i = 0; i < weatherDTOS.size(); i++) {
            System.out.println("V gorode " + weatherDTOS.get(i).getCity() + " na daty " + weatherDTOS.get(i).getLocalDate() + " ozhidaetsya " + weatherDTOS.get(i).getWeatherText() + " temperatyra " + weatherDTOS.get(i).getTemperature());

        }
    }
}

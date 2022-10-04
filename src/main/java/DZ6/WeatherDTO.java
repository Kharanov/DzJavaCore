package DZ6;

public class WeatherDTO {
    String city;
    String localDate;
    String weatherText;
    Double temperature;

    public WeatherDTO(String city, String localDate, String weatherText, Double temperature){
        this.city=city;
        this.localDate=localDate;
        this.weatherText=weatherText;
        this.temperature=temperature;
    }

    public String getCity() {
        return city;
    }
    public String getLocalDate() {
        return localDate;
    }
    public String getWeatherText() {
        return weatherText;
    }

    public Double getTemperature() {
        return temperature;
    }
}

package DZ6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class YandexWeatherProvider implements WeatherProvider {
    @Override
    public List<WeatherDTO> getWeather() throws IOException {
        OkHttpClient okhttp = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast?lat=59.956505&lon=30.329132")
                .addHeader("X-Yandex-API-Key", "01b60a57-4b16-45f2-94b5-e5f867213356")
                .build();

        Response response = okhttp.newCall(request).execute();


        String body = response.body().string();


        ObjectMapper objectMapper = new ObjectMapper();

        WeatherResponse weatherResponse = objectMapper.readValue(body, WeatherResponse.class);


        List<WeatherDTO> weatherDTOs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<Forecast> forecasts = weatherResponse.getForecasts();
            Forecast forecast = forecasts.get(i);
            Day day = forecast.getParts().getDay();

            WeatherDTO weatherDTO = new WeatherDTO(weatherResponse.getGeoObject().getProvince().getName(), forecast.getDate(), day.getCondition(), day.getTemperature());
            weatherDTOs.add(weatherDTO);
        }
        return weatherDTOs;
    }
}


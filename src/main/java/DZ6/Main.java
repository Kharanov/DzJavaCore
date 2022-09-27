package DZ6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, JsonProcessingException, JsonMappingException {
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
        System.out.println(body);
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isRedirect());
        System.out.println(response.isSuccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());

        ObjectMapper objectMapper = new ObjectMapper();

        WeatherResponse weatherResponse = objectMapper.readValue(body, WeatherResponse.class);

        System.out.println(weatherResponse.getGeoObject().getProvince().getName());
        for (int i = 0; i < 5; i++) {
            List<Forecast> forecasts = weatherResponse.getForecasts();
            Forecast forecast = forecasts.get(i);
            Day day = forecast.getParts().getDay();
            System.out.println("V gorode " + weatherResponse.getGeoObject().getProvince().getName() + " na daty " + forecast.getDate() + " ozhidaetsya " + day.getCondition() + " temperatyra " + day.getTemperature());
        }
    }
}

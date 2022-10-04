package DZ6;

import java.io.IOException;
import java.util.List;

public interface WeatherProvider {
    List<WeatherDTO> getWeather() throws IOException;
}

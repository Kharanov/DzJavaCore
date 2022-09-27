package DZ6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties (ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty (value = "geo_object")
    GeoObject geoObject;
    List<Forecast> forecasts;
    public WeatherResponse() {
    }
    public GeoObject getGeoObject() {
        return geoObject;
    }
    public void setGeoObject(GeoObject geoObject) {
        this.geoObject = geoObject;
    }
    public List<Forecast> getForecasts() {
        return forecasts;
    }
    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }


}

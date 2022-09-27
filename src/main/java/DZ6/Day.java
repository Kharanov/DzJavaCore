package DZ6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty(value = "temp_avg")
    private String temperature;
    private String condition;

    public Day() {}

    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature=temperature;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

}

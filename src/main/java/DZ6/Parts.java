package DZ6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parts {
    private Day day;

    public Parts() {}

    public Day getDay() {
        return day;
    }
    public void setDay(Day day) {
        this.day = day;
    }
}

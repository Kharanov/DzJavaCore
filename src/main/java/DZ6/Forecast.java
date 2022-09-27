package DZ6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    public Forecast() {
    }

    private String date;
    private Parts parts;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public  Parts getParts() {
        return parts;
    }
    public void setParts(Parts parts){
        this.parts=parts;
    }
}

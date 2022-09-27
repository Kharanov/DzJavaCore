package DZ6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoObject {
    Province province;

    public GeoObject() {
    }
    public Province getProvince() {
        return province;
    }
    public void setProvince(Province province) {
        this.province=province;
    }
}

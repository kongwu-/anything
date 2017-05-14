package cc.leevi.anything.model;

/**
 * 位置信息
 * Created by jiang on 2017/5/3.
 */
public class Location {
    /**
     * 维度
     */
    private Double latitude;
    /**
     * 经度
     */
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}

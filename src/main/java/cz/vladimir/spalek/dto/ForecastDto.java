package cz.vladimir.spalek.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class ForecastDto {


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate_0() {
        return date_0;
    }

    public void setDate_0(Date date_0) {
        this.date_0 = date_0;
    }

    public double getMaxTemp_c_0() {
        return maxTemp_c_0;
    }

    public void setMaxTemp_c_0(double maxTemp_c_0) {
        this.maxTemp_c_0 = maxTemp_c_0;
    }

    public double getMinTemp_c_0() {
        return minTemp_c_0;
    }

    public void setMinTemp_c_0(double minTemp_c_0) {
        this.minTemp_c_0 = minTemp_c_0;
    }

    public double getMaxWind_mps_0() {
        return maxWind_mps_0;
    }

    public void setMaxWind_mps_0(double maxWind_mps_0) {
        this.maxWind_mps_0 = maxWind_mps_0;
    }

    public int getAvg_humidity_0() {
        return avg_humidity_0;
    }

    public void setAvg_humidity_0(int avg_humidity_0) {
        this.avg_humidity_0 = avg_humidity_0;
    }

    public String getWeather_description_0() {
        return weather_description_0;
    }

    public void setWeather_description_0(String weather_description_0) {
        this.weather_description_0 = weather_description_0;
    }

    private String location;
    private Date date_0;
    private double maxTemp_c_0;
    private double minTemp_c_0;
    private double maxWind_mps_0;
    private int avg_humidity_0;
    private String weather_description_0;
}

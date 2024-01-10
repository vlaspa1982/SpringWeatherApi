package cz.vladimir.spalek.dto;

public class Forecastday {


    private String date;
    private int date_epoch;
    private Day day;

    private java.util.ArrayList<Hour> hour;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getDate_epoch() {
        return date_epoch;
    }

    public void setDate_epoch(int date_epoch) {
        this.date_epoch = date_epoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public java.util.ArrayList<Hour> getHour() {
        return hour;
    }

    public void setHour(java.util.ArrayList<Hour> hour) {
        this.hour = hour;
    }
}

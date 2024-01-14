package cz.vladimir.spalek.dto;

import java.util.ArrayList;

public class DailyDto {

    public DailyDto(){setHours(new ArrayList<>());}
    public ArrayList<HourlyDto> getHours() {
        return Hours;
    }

    public void setHours(ArrayList<HourlyDto> hours) {
        Hours = hours;
    }

    private ArrayList<HourlyDto> Hours;
}

package cz.vladimir.spalek.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ForecastDto {

    public ArrayList<DailyDto> getDailydata() {
        return daysdata;
    }
    public ForecastDto() {setDailydata(new ArrayList<>());}
    public void setDailydata(ArrayList<DailyDto> daysdata) {
        this.daysdata = daysdata;
    }

    private ArrayList<DailyDto> daysdata;

}

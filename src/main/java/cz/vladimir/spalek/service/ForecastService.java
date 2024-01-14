package cz.vladimir.spalek.service;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.connector.ForecastApiConnector;
import cz.vladimir.spalek.dto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service

public class ForecastService {
    public ForecastDto getForecastForCity(City city ){

       ForecastApiConnector forecastConnector = new ForecastApiConnector();
        ForecastApiDto connectorForecastForCity = forecastConnector.getForecastForCity(city);
        ForecastDto forecastDto = transformForecastDto(connectorForecastForCity);
        return forecastDto;
    }

    private ForecastDto transformForecastDto(ForecastApiDto forecastApiDto) {
        ForecastDto forecastDto = new ForecastDto();
        for (int i = 0; i < forecastApiDto.getForecast().getForecastday().size(); i++) {
            Forecastday fDay = forecastApiDto.getForecast().getForecastday().get(i);
            forecastDto.getDailydata().add(new DailyDto());
            ArrayList<Hour> hours = fDay.getHour();
            for (int j = 0; j < hours.size(); j++) {
                HourlyDto wDto = new HourlyDto();
                wDto.setTemp_c(hours.get(j).getTemp_c());
                wDto.setWind_kph(hours.get(j).getWind_kph());
                wDto.setHumidity(hours.get(j).getHumidity());
                forecastDto.getDailydata().get(i).getHours().add(wDto);
            }
        }
        return forecastDto;
    }
}

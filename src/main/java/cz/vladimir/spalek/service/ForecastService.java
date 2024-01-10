package cz.vladimir.spalek.service;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.connector.ForecastApiConnector;
import cz.vladimir.spalek.dto.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service

public class ForecastService {
    public ForecastDto getForecastForCity(City city ){

       ForecastApiConnector forecastConnector = new ForecastApiConnector();
        ForecastApiDto connectorForecastForCity = forecastConnector.getForecastForCity(city);
        ForecastDto forecastDto = transformForecastDto(connectorForecastForCity);
        return forecastDto;
    }

    private static ForecastDto transformForecastDto(ForecastApiDto forecastApiDto) {
        List<Forecastday> days = new ArrayList<Forecastday>();
        ForecastDto forecastDto = new ForecastDto();

        forecastDto.setLocation(forecastApiDto.getLocation().getName());
        forecastDto.setWeather_description_0(forecastApiDto.getCurrent().getCondition().getText());
        return forecastDto;
    }
}

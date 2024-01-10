package cz.vladimir.spalek.service;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.connector.ForecastApiConnector;
import cz.vladimir.spalek.dto.Forecast;
import cz.vladimir.spalek.dto.ForecastApiDto;
import cz.vladimir.spalek.dto.ForecastDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ForecastServiceBackUp {
    public ForecastDto getForecastForCity(City cityEnum ){

       ForecastApiConnector forecastConnector = new ForecastApiConnector();
        ForecastApiDto connectorForecastForCity = forecastConnector.getForecastForCity(cityEnum);
        ForecastDto forecastDto = transformForecastDto(connectorForecastForCity);
        return forecastDto;
    }

    private static ForecastDto transformForecastDto(ForecastApiDto forecastApiDto) {

        ForecastDto forecastDto = new ForecastDto();
        forecastDto.setLocation(forecastApiDto.getLocation().getName());
        forecastDto.setWeather_description_0(forecastApiDto.getCurrent().getCondition().getText());
        List<Forecast> forecasts = new ArrayList<Forecast>();




        return forecastDto;
    }
}

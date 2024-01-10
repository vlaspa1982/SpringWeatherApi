package cz.vladimir.spalek.service;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.connector.WeatherApiConnector;
import cz.vladimir.spalek.dto.WeatherApiDto;
import cz.vladimir.spalek.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public WeatherDto getWeatherForCity(City cityEnum ){

        WeatherApiConnector connector = new WeatherApiConnector();
        WeatherApiDto connectorWeatherForCity = connector.getWeatherForCity(cityEnum);
        WeatherDto weatherDto = transformDto(connectorWeatherForCity);
        return weatherDto;
    }

    private static WeatherDto transformDto(WeatherApiDto weatherApiDto) {
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setLocation(weatherApiDto.getLocation().getName());
        weatherDto.setWeather_description(weatherApiDto.getCurrent().getCondition().getText());
        weatherDto.setRel_humidity(weatherApiDto.getCurrent().getHumidity());
        weatherDto.setTimestamp(weatherApiDto.getCurrent().getLast_updated());
        weatherDto.setTemp_celsius(weatherApiDto.getCurrent().getTemp_c());
        weatherDto.setWind_direction(weatherApiDto.getCurrent().getWind_dir());
        weatherDto.setWindSpeed_mps(Math.round(weatherApiDto.getCurrent().getWind_kph()/3.6));
        return weatherDto;
    }
}

package cz.vladimir.spalek.controller;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.dto.WeatherDto;
import cz.vladimir.spalek.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController

public class WeatherController {
    @Autowired
    WeatherService weatherService;
    @CrossOrigin
    @RequestMapping("/weather/{city}")
    WeatherDto getWeatherForCity(@PathVariable("city") java.lang.String city){
    City cityEnum = City.valueOf(city.toUpperCase());
        return weatherService.getWeatherForCity(cityEnum);
    }
    @CrossOrigin
    @RequestMapping("/weather")
    Collection<WeatherDto> getWeather(){
        List<WeatherDto> weatherDtoList = new ArrayList<>();
        for (City city: City.values()){
            weatherDtoList.add(weatherService.getWeatherForCity(city));
        };
        return weatherDtoList;
    }

}

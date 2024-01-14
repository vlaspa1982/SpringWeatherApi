package cz.vladimir.spalek.controller;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.dto.ForecastDto;
import cz.vladimir.spalek.dto.WeatherDto;
import cz.vladimir.spalek.service.ForecastService;
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

public class ForecastController {
    @Autowired
    ForecastService forecastService;
    @CrossOrigin
    @RequestMapping("/forecast/{city}")
    ForecastDto getForecastForCity(@PathVariable("city") java.lang.String city){
        City cityEnum = City.valueOf(city.toUpperCase());
        return forecastService.getForecastForCity(cityEnum);
    }


}

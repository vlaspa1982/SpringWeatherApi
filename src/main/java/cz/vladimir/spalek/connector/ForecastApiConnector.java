package cz.vladimir.spalek.connector;

import cz.vladimir.spalek.City;
import cz.vladimir.spalek.dto.Day;
import cz.vladimir.spalek.dto.ForecastApiDto;
import cz.vladimir.spalek.dto.WeatherApiDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

public class ForecastApiConnector {
    private static java.lang.String baseUrl = "https://api.weatherapi.com/v1/";
    private static java.lang.String urlParameters = "forecast.json?key=";
    private static java.lang.String APIKey = "d2bfd175c8b745e9a8893338231412";
    private static java.lang.String url = baseUrl + urlParameters + APIKey + "&q=";

    public ForecastApiDto getForecastForCity(City city){

        RestTemplate forecastTemplate = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI(url + city.toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ResponseEntity<ForecastApiDto> responseEntity = forecastTemplate.getForEntity(uri, ForecastApiDto.class);
        return responseEntity.getBody();
    }
}

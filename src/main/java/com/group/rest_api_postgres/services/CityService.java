package com.group.rest_api_postgres.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.rest_api_postgres.entities.City;
import com.group.rest_api_postgres.entities.CountryEntity;
import com.group.rest_api_postgres.pojos.CityRequest;
import com.group.rest_api_postgres.repositories.CityRepository;
import com.group.rest_api_postgres.repositories.CountryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CityService {

    @Autowired
    CityRepository cityresRepository;

    @Autowired
    CountryRepository countryRepository;

    public CityService() {

    }

    public List<City> getAllCities() {
        System.out.println("Fetching all cities data from Postgres ->");
        return cityresRepository.findAllByOrderByIdAsc();
    }

    public City getCity(String cityname) {
        return cityresRepository.findByCityname(cityname);
    }

    public City getCityById(Long id) {
        return cityresRepository.findById(id).orElse(null);
    }

    public City saveCity(City City) {
        return cityresRepository.save(City);
    }

    public void deleteCity(City City) {
        cityresRepository.delete(City);
    }

    public void updateCity(Long cityId, City updatedCity) {
        Optional<City> existingCityOptional = cityresRepository.findById(cityId);

        if (existingCityOptional.isPresent()) {
            City existingCity = existingCityOptional.get();

            existingCity.setCityname(updatedCity.getCityname());
            existingCity.setCitycode(updatedCity.getCitycode());

            cityresRepository.save(existingCity);
        } else {
            throw new EntityNotFoundException("City with ID " + cityId + " not found");
        }
    }

    public City addCity(CityRequest cityrequest) {
        CountryEntity country = countryRepository.findById(cityrequest.country_id);

        City city = new City();

        city.setCityname(cityrequest.cityname);
        city.setCitycode(cityrequest.citycode);
        city.setCountry(country);
        return cityresRepository.save(city);
    }

}

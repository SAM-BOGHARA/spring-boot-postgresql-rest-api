package com.group.rest_api_postgres.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.group.rest_api_postgres.entities.City;
import com.group.rest_api_postgres.pojos.CityRequest;
import com.group.rest_api_postgres.pojos.CourseRequest;
import com.group.rest_api_postgres.services.CityService;
import com.group.rest_api_postgres.services.CourseService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class HomeController {

    @Autowired
    CityService cityService;

    @Autowired
    CourseService courseService;

    @GetMapping("cities/all")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("cities/{id}")
    public City getCityById(@PathVariable Long id) {
        return cityService.getCityById(id);
    }

    @GetMapping("getcity")
    public City getCity(String cityname) {
        return cityService.getCity(cityname);
    }

    @PostMapping("add-city")
    public City saveCity(@RequestBody City City) {
        return cityService.saveCity(City);
    }

    @PostMapping("savecity")
    public City addCity(@RequestBody CityRequest cityrequest) {

        return cityService.addCity(cityrequest);
    }

    @PostMapping("addcourse")
    public Map<String, Boolean> addCourse(@RequestBody CourseRequest courseRequest) {
        courseService.addCoursewithContents(courseRequest);

        Map<String, Boolean> response = new HashMap<>();
        response.put("Course Added", Boolean.TRUE);
        return response;
    }
    
    

    @PutMapping("update-City/{id}")
    public Map<String, Boolean> updateCity(@PathVariable(value = "id") Long cityId,
            @RequestBody City City) {
        cityService.updateCity(cityId, City);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Updated", Boolean.TRUE);
        return response;
    }

    @DeleteMapping("delete-City/{id}")
    public Map<String, Boolean> deleteCity(@PathVariable City id) {

        cityService.deleteCity(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }

}

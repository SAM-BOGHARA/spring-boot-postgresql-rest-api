package com.group.rest_api_postgres.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City findByCityname(String cityname);

    List<City> findAllByOrderByIdAsc();

}

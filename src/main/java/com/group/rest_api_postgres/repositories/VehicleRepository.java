package com.group.rest_api_postgres.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {


}

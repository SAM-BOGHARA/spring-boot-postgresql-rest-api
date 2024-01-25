package com.group.rest_api_postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.Manufacturer;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Integer> {
    
}

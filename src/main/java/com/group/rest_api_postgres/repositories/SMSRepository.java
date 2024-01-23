package com.group.rest_api_postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.SMS;

@Repository	
public interface SMSRepository extends JpaRepository<SMS, Integer>{

}

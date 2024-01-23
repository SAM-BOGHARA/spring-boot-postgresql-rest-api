package com.group.rest_api_postgres.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.CountryEntity;


@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Integer> {
    CountryEntity findById(int id);


    @Query("from CountryEntity where id = ?1")
    CountryEntity getById(int id);

    @Query("from CountryEntity where countryname = ?1 and id = ?2")
    CountryEntity getByIdAndCountryname(String string,int id);

    List<CountryEntity> findByCountrynameAndPopulationGreaterThanEqual(String countryname, long population);

    List<CountryEntity> findByCountrynameAndPopulationLessThanEqual(String countryname, long population);

    List<CountryEntity> findByCountrynameAndPopulationLessThan(String countryname, long population);

    List<CountryEntity> findByCountrynameAndPopulationGreaterThan(String countryname, long population);

    List<CountryEntity> findByCountrynameStartingWithIgnoreCaseOrderByPopulationAsc(String prefix);

    List<CountryEntity> findByCountrynameStartingWithIgnoreCaseOrderByPopulationDesc(String suffix);
    
    
    List<CountryEntity> findByCountrynameStartingWith(String prefix);
     
    List<CountryEntity> findByCountrynameEndingWith(String suffix);

    List<CountryEntity> findByCountrynameContaining(String substring);

}

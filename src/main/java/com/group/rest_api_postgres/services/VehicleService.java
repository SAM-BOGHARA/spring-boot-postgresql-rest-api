package com.group.rest_api_postgres.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.rest_api_postgres.entities.Manufacturer;
import com.group.rest_api_postgres.entities.Vehicle;
import com.group.rest_api_postgres.entities.vehicle.Car;
import com.group.rest_api_postgres.entities.vehicle.MotorBike;
import com.group.rest_api_postgres.repositories.CarRepository;
import com.group.rest_api_postgres.repositories.ManufacturerRepository;
import com.group.rest_api_postgres.repositories.MotorBikeRepository;
import com.group.rest_api_postgres.repositories.VehicleRepository;

import jakarta.transaction.Transactional;

@Service
public class VehicleService {
    @Autowired
    CarRepository carRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    MotorBikeRepository motorBikeRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Transactional
    public List<Car> addCars(List<Car> cars) {
        return carRepository.saveAll(cars);
    }

    public List<Manufacturer> addManufacturers(List<Manufacturer> manufacturers) {
        return manufacturerRepository.saveAll(manufacturers);
    }

    public List<MotorBike> addMotorBikes(List<MotorBike> motorbikes) {
        return motorBikeRepository.saveAll(motorbikes);
    }

    public List<Vehicle> addVehicles(List<Vehicle> vehicles) {
        return vehicleRepository.saveAll(vehicles);
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturerRepository.findAll();
    }

    public List<MotorBike> getMotorBikes() {
        return motorBikeRepository.findAll();
    }

    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }
}

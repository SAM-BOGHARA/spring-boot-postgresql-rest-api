package com.group.rest_api_postgres.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.rest_api_postgres.entities.Manufacturer;
import com.group.rest_api_postgres.entities.Vehicle;
import com.group.rest_api_postgres.entities.vehicle.Car;
import com.group.rest_api_postgres.entities.vehicle.MotorBike;
import com.group.rest_api_postgres.repositories.CarRepository;
import com.group.rest_api_postgres.repositories.ManufacturerRepository;
import com.group.rest_api_postgres.repositories.MotorBikeRepository;
import com.group.rest_api_postgres.repositories.VehicleRepository;
import com.group.rest_api_postgres.services.VehicleService;

import io.micrometer.common.lang.NonNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

	@Autowired
	ManufacturerRepository manufacturerRepository;

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	CarRepository carRepository;

	@Autowired
	MotorBikeRepository motorBikeRepository;

	@Autowired
	VehicleService vehicleService;

	@PostMapping("add-manufacturers")
	public List<Manufacturer> addManufacturers(@NonNull @RequestBody List<Manufacturer> manufacturers) {
		return vehicleService.addManufacturers(manufacturers);
	}

	@PostMapping("add-vehicles")
	public List<Vehicle> addVehicles(@NonNull @RequestBody List<Vehicle> vehicles) {
		return vehicleService.addVehicles(vehicles);
	}

	@PostMapping("add-cars")
	public List<Car> addCars(@NonNull @RequestBody List<Car> cars) {
		return vehicleService.addCars(cars);
	}

	@PostMapping("add-motorbikes")
	public List<MotorBike> addMotorBikes(@NonNull @RequestBody List<MotorBike> motorbikes) {
		return vehicleService.addMotorBikes(motorbikes);
	}

	@GetMapping("get-manufacturers")
	public List<Manufacturer> getManufacturers() {
		return vehicleService.getManufacturers();
	}

	@GetMapping("get-vehicles")
	public List<Vehicle> getVehicles() {
		return vehicleService.getVehicles();
	}

	@GetMapping("get-cars")
	public List<Car> getCars() {
		return vehicleService.getCars();
	}

	@GetMapping("get-motorbikes")
	public List<MotorBike> getMotorBikes() {
		return vehicleService.getMotorBikes();
	}

}

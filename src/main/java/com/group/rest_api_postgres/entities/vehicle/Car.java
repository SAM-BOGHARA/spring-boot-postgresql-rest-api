package com.group.rest_api_postgres.entities.vehicle;

import com.group.rest_api_postgres.entities.Vehicle;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    
    private String seatingcapacity;

    private String sunroof;

    public String getSeatingcapacity() {
        return seatingcapacity;
    }

    public void setSeatingcapacity(String seatingcapacity) {
        this.seatingcapacity = seatingcapacity;
    }

    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }
    
}

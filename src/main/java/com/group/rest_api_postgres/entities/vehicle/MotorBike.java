package com.group.rest_api_postgres.entities.vehicle;

import com.group.rest_api_postgres.entities.Vehicle;

import jakarta.persistence.Entity;

@Entity
public class MotorBike extends Vehicle {
    private String pillionseat;
    private String passengerfootrest;
    private String saddleheight;

    public String getPillionseat() {
        return pillionseat;
    }

    public void setPillionseat(String pillionseat) {
        this.pillionseat = pillionseat;
    }

    public String getPassengerfootrest() {
        return passengerfootrest;
    }

    public void setPassengerfootrest(String passengerfootrest) {
        this.passengerfootrest = passengerfootrest;
    }

    public String getSaddleheight() {
        return saddleheight;
    }

    public void setSaddleheight(String saddleheight) {
        this.saddleheight = saddleheight;
    }

}

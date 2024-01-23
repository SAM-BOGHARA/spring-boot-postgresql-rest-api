package com.group.rest_api_postgres.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
@AttributeOverride(name = "entrydate",column = @Column(name = "entrydate"))
public class Patient extends PersonInfo {
	private String symptoms;

	private String healthhistory;

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getHealthhistory() {
		return healthhistory;
	}

	public void setHealthhistory(String healthhistory) {
		this.healthhistory = healthhistory;
	}

}

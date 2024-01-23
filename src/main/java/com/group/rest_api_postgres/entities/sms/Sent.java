package com.group.rest_api_postgres.entities.sms;

import java.time.ZonedDateTime;

import com.group.rest_api_postgres.entities.SMS;

import jakarta.persistence.Entity;

@Entity
public class Sent extends SMS{
	private ZonedDateTime deliveredon;

	public ZonedDateTime getDeliveredon() {
		return deliveredon;
	}

	public void setDeliveredon(ZonedDateTime deliveredon) {
		this.deliveredon = deliveredon;
	}
}

package com.group.rest_api_postgres.entities.sms;

import com.group.rest_api_postgres.entities.SMS;

import jakarta.persistence.Entity;

@Entity
public class Failed extends SMS {

	private String errormessage;

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
}

package com.group.rest_api_postgres.entities.sms;

import com.group.rest_api_postgres.entities.SMS;

import jakarta.persistence.Entity;

@Entity
public class Inbox extends SMS {

	private String smstype;

	public String getSmstype() {
		return smstype;
	}

	public void setSmstype(String smstype) {
		this.smstype = smstype;
	}
}

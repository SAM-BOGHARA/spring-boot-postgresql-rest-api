package com.group.rest_api_postgres.entities;

import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "sms")
@DiscriminatorColumn(name = "smsfolder")
public class SMS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String fromorto;

	private String messagetext;

	private ZonedDateTime sentonreceivedon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromorto() {
		return fromorto;
	}

	public void setFromorto(String fromorto) {
		this.fromorto = fromorto;
	}

	public String getMessagetext() {
		return messagetext;
	}

	public void setMessagetext(String messagetext) {
		this.messagetext = messagetext;
	}

	public ZonedDateTime getSentonreceivedon() {
		return sentonreceivedon;
	}

	public void setSentonreceivedon(ZonedDateTime sentonreceivedon) {
		this.sentonreceivedon = sentonreceivedon;
	}

}

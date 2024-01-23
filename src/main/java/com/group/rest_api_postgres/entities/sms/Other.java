package com.group.rest_api_postgres.entities.sms;


import com.group.rest_api_postgres.entities.SMS;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "not null")
public class Other extends SMS {

}

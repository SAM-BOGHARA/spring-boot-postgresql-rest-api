package com.group.rest_api_postgres.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.group.rest_api_postgres.entities.SMS;
import com.group.rest_api_postgres.entities.sms.Failed;
import com.group.rest_api_postgres.entities.sms.Inbox;
import com.group.rest_api_postgres.entities.sms.Other;
import com.group.rest_api_postgres.entities.sms.Sent;
import com.group.rest_api_postgres.repositories.SMSRepository;
import com.group.rest_api_postgres.repositories.sms.FailedRepository;
import com.group.rest_api_postgres.repositories.sms.InboxRepository;
import com.group.rest_api_postgres.repositories.sms.OtherRepository;
import com.group.rest_api_postgres.repositories.sms.SentRepository;

@Service
public class SMSService {

	@Autowired
	SMSRepository smsRepository;

	@Autowired
	InboxRepository inboxRepository;

	@Autowired
	SentRepository sentRepository;

	@Autowired
	FailedRepository failedRepository;
	
	@Autowired 
	OtherRepository otherRepository;

	public SMSService() {

	}
	
	public List<SMS> getAllSms() {
		return smsRepository.findAll();
	}

	public Inbox addToInbox(@NonNull Inbox inbox) {
		return inboxRepository.save(inbox);
	}

	public Sent addToSent(@NonNull Sent sent) {
		return sentRepository.save(sent);
	}

	public Failed addToFailed(@NonNull Failed failed) {
		return failedRepository.save(failed);
	}

	public List<Inbox> getInboxList() {
		return inboxRepository.findAll();
	}
	
	public List<Sent> getSentList() {
		return sentRepository.findAll();
	}
	
	public List<Failed> getFailedList() {
		return failedRepository.findAll();
	}

	public List<Other> getOtherList() {
		return otherRepository.findAll();
	}

	

}

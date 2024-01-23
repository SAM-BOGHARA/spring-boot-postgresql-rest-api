package com.group.rest_api_postgres.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.rest_api_postgres.entities.SMS;
import com.group.rest_api_postgres.entities.sms.Failed;
import com.group.rest_api_postgres.entities.sms.Inbox;
import com.group.rest_api_postgres.entities.sms.Other;
import com.group.rest_api_postgres.entities.sms.Sent;
import com.group.rest_api_postgres.services.SMSService;

@RestController
@RequestMapping("sms")
public class SmsController {

	@Autowired
	SMSService smsService;
	
	@GetMapping("all-sms")
	public List<SMS> getAllSms(){
		return smsService.getAllSms();
	}

	@PostMapping("add-inbox")
	public Inbox addToInbox(@RequestBody @NonNull Inbox inbox) {
		return smsService.addToInbox(inbox);
	}

	@PostMapping("add-sent")
	public Sent addToSent(@RequestBody @NonNull Sent sent) {
		return smsService.addToSent(sent);
	}

	@PostMapping("add-failed")
	public Failed addToFailed(@RequestBody @NonNull Failed failed) {
		return smsService.addToFailed(failed);
	}
	
	@GetMapping("get-inbox-sms")
	public List<Inbox> getInboxList(){
		return smsService.getInboxList();
	}
	
	@GetMapping("get-sent-sms")
	public List<Sent> getSentList(){
		return smsService.getSentList();
	}
	
	@GetMapping("get-failed-sms")
	public List<Failed> getFailedList(){
		return smsService.getFailedList();
	}
	
	@GetMapping("get-other-sms")
	public List<Other> getOtherList(){
		return smsService.getOtherList();
	}

}

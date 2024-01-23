package com.group.rest_api_postgres.repositories.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.sms.Inbox;

@Repository	
public interface InboxRepository extends JpaRepository<Inbox, Integer>{

}

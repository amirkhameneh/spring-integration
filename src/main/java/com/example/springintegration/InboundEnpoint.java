package com.example.springintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class InboundEnpoint {
	@Autowired
	Crm crm;
	private Logger log = LoggerFactory.getLogger(this.getClass().getName());
	


	public Message<?> get(Message<?> msg) {
		log.info("GET method");

		Request request = new Request();
		request.setMsp( "123" );
		crm.sendRequest( request );
		return MessageBuilder.withPayload("asdasda").copyHeadersIfAbsent(msg.getHeaders())
				.setHeader("http_statusCode", HttpStatus.OK).build();
	}

}

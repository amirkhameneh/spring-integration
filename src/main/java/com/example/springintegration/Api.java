package com.example.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	@Autowired
	Crm crm;
	@GetMapping("/send/{msg}")
	public String sent(@PathVariable(value="msg") final String msg  ){
		Request request = new Request();
		request.setMsp( msg );
		crm.sendRequest( request );
		return msg;
	}
}

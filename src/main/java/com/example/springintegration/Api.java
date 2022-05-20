package com.example.springintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	@GetMapping("/send/{msg}")
	public String sent(@PathVariable(value="msg") final String msg  ){
		return msg;
	}
}

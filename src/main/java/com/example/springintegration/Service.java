package com.example.springintegration;

import org.springframework.stereotype.Component;

@Component
public class Service {

	public void serve(String msg){
		System.out.println("***********-----------*************"+ msg);
	}
}

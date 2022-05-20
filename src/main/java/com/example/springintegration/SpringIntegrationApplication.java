package com.example.springintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
//@ImportResource("/META-INF/spring/integration/demo.xml")
public class SpringIntegrationApplication {

	public static void main( String[] args ) {
		AbstractApplicationContext context =
			new ClassPathXmlApplicationContext("/META-INF/spring/integration/demo.xml", SpringIntegrationApplication.class);
		Crm crm = (Crm) context.getBean("crm");
		Request request = new Request();
		request.setMsp( "123" );
		crm.sendRequest( request );
		//	SpringApplication.run( SpringIntegrationApplication.class, args );
	}

}

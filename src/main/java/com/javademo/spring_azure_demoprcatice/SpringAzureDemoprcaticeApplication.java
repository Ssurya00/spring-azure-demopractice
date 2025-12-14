package com.javademo.spring_azure_demoprcatice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoprcaticeApplication {

	@GetMapping("/getMessage")
	public  String getMessage(){
		return "congrats...! your application deployed successfully on azure platform nice...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoprcaticeApplication.class, args);
	}

}

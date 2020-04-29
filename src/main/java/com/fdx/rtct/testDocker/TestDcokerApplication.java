package com.fdx.rtct.testDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@ComponentScan(basePackages={"com.fdx.rtct.testDocker"})
@RequestMapping
public class TestDcokerApplication {
	
	public static void main(String[] args) {
		System.out.println("--allocation started-----");
		SpringApplication.run(TestDcokerApplication.class, args);
	}
	
	@RequestMapping(path = "/method2" , method = RequestMethod.GET )
	public String method(){
		return "Scan Test Controller 2";
		
	}
	
	
}

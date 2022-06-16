package com.sonisha.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sonisha.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;

//controller handling http requests
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class HelloWorldController {
	
	//GET
	//URI - /hello-world

	//method -"Hello World"
	@GetMapping(path = "/hello-world")
	public String helloworld() {
		return "hello world";
	}
	
	//hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("Some error has Happened! Contact Support");
		return new HelloWorldBean("Hello World - changed");
	}
	
//	//hello-world/path-variable/sonishakarki
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloworldPathVariable( @PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	
	
	
}

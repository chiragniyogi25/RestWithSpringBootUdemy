package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

//For us to test we need a controller, which is a class that initializes 
//and exposes our HTTP verbs to the browser or a client like POSTMAN.

//Create a class with the @RestController annotation. 
//Due to the annotation, this class will be auto-detected through classpath scanning and 
//the methods annotated with @RequestMapping annotation will be exposed as HTTP endpoints. 
//When an incoming request matches the requirements specified by the @RequestMapping annotation, 
//the method will execute to serve the request.

@RestController

public class GreetingController {
	
	private static final String template = "Hello, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	//for the method greeting to be recognized as an endpoint REST annotation of 
	//RequestMapping is required
	//with the annotation we will add the route to find this resource
	//@RequestMapping is one of the most common annotation used in Spring Web applications.
	//This annotation maps HTTP requests to handler methods of MVC and REST controllers.
	
//----------------------------------------------------------------------------	
	//RequestParam breaks down the Request Mapping
	//here the value="name" is mapped with String name
			//by default if we do not have query params in our path we get output as Hello World!
			//here the route is localhost:8080/greeting
			//but if path is http://localhost:8080/greeting?name=Udemy we get output Hello Udemy!
			//incrementAndGet returns the incremented value of previous value
			//name is not defined bcoz we will receive it as a parameter in our method

//-------------------------------------------------------------------------------------
	
	//this is where the endpoints starts
	@RequestMapping("/greeting")
	public Greeting greeting( @RequestParam(value="name",defaultValue = "World") String name) {
		
		return new Greeting(counter.incrementAndGet(),String.format(template,name));
		
	}

}

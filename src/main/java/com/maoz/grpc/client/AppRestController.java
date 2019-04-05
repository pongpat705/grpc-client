package com.maoz.grpc.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppRestController.class);
	
	@Autowired
	private HelloWorldClient helloWorldClient;
	
	@GetMapping("/sayHello")
	public void blockingIo(@RequestParam String name, @RequestParam String lastName) {
		
		String greetingMessage = helloWorldClient.sayHello(name, lastName);
		
		LOGGER.info("response Message {}", greetingMessage);
	}
	
	@GetMapping("/lotsOfReplies")
	public void lotsOfReplies(@RequestParam String name, @RequestParam String lastName) {
		
		helloWorldClient.lotsOfReplies(name, lastName);
		
	}
	
	@GetMapping("/lotsOfGreetings")
	public void lotsOfGreetings(@RequestParam String name, @RequestParam String lastName) throws InterruptedException {
		
		helloWorldClient.lotsOfGreetings(name, lastName);
		
	}
	
	@GetMapping("/bidiHello")
	public void bidiHello(@RequestParam String name, @RequestParam String lastName) throws InterruptedException {
		
		helloWorldClient.bidiHello(name, lastName);
		
	}
	
	
}

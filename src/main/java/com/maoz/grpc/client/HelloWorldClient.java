package com.maoz.grpc.client;

import java.util.Iterator;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.maoz.grpc.Greeting;
import com.maoz.grpc.HelloWorldServiceGrpc;
import com.maoz.grpc.HelloWorldServiceGrpc.HelloWorldServiceBlockingStub;
import com.maoz.grpc.HelloWorldServiceGrpc.HelloWorldServiceFutureStub;
import com.maoz.grpc.Person;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

@Component
public class HelloWorldClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldClient.class);

	private HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;
	
	

	@PostConstruct
	private void init() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

		helloWorldServiceBlockingStub = HelloWorldServiceGrpc.newBlockingStub(managedChannel);
		
	}

	public String sayHello(String firstName, String lastName) {
		Person person = Person.newBuilder().setFirstName(firstName).setLastName(lastName).build();
		LOGGER.info("client sending {}", person);

		Greeting greeting = helloWorldServiceBlockingStub.sayHello(person);
		LOGGER.info("client received {}", greeting);

		return greeting.getMessage();
	}
	
	public void lotsOfReplies(String firstName, String lastName) {
		Person person = Person.newBuilder().setFirstName(firstName).setLastName(lastName).build();
		LOGGER.info("client sending {}", person);

		Iterator<Greeting> greetings = helloWorldServiceBlockingStub.lotsOfReplies(person);
		while (greetings.hasNext()) {
			Greeting greeting2 = (Greeting) greetings.next();
			LOGGER.info("client received {}", greeting2);
		}
		
	}
	
	public void lotsOfGreetings(String firstName, String lastName) {
		
//		helloWorldServiceBlockingStub
	}
}

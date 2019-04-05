package com.maoz.grpc.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.maoz.grpc.Greeting;
import com.maoz.grpc.HelloWorldServiceGrpc;
import com.maoz.grpc.HelloWorldServiceGrpc.HelloWorldServiceBlockingStub;
import com.maoz.grpc.HelloWorldServiceGrpc.HelloWorldServiceStub;
import com.maoz.grpc.Person;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

@Component
public class HelloWorldClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldClient.class);

	private HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

	private HelloWorldServiceStub helloWorldServiceStub;

	@PostConstruct
	private void init() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

		helloWorldServiceBlockingStub = HelloWorldServiceGrpc.newBlockingStub(managedChannel);

		helloWorldServiceStub = HelloWorldServiceGrpc.newStub(managedChannel);

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

	public void lotsOfGreetings(String firstName, String lastName) throws InterruptedException {

		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person person = Person.newBuilder().setFirstName(firstName + i).setLastName(lastName + i).build();
			persons.add(person);
		}

		CountDownLatch finishedLatch = new CountDownLatch(1);
		StreamObserver<Greeting> responseObserver = new StreamObserver<Greeting>() {
			@Override
			public void onNext(Greeting value) {

				LOGGER.info("Greet :{}", value.getMessage());
			}

			@Override
			public void onError(Throwable t) {
				LOGGER.info("client err {}", t.getMessage());
				finishedLatch.countDown();
			}

			@Override
			public void onCompleted() {
				LOGGER.info("Finished lotsOfGreetings");
				finishedLatch.countDown();
			}
		};

		StreamObserver<Person> requestObserver = helloWorldServiceStub.lotsOfGreetings(responseObserver);
		try {
			// Send numPoints points randomly selected from the features list.
			for (Person person : persons) {
				LOGGER.info("client send {}", person.getFirstName());
				requestObserver.onNext(person);
				if (finishedLatch.getCount() == 0) {
					// RPC completed or errored before we finished sending.
					// Sending further requests won't error, but they will just be thrown away.
					return;
				}
			}
		} catch (RuntimeException e) {
			LOGGER.info("RuntimeException err {}", e.getMessage());
			requestObserver.onError(e);
			throw e;
		}
		// Mark the end of requests
		requestObserver.onCompleted();

		// Receiving happens asynchronously
		finishedLatch.await(1, TimeUnit.MINUTES);
	}

	public void bidiHello(String firstName, String lastName) throws InterruptedException {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person person = Person.newBuilder().setFirstName(firstName + i).setLastName(lastName + i).build();
			persons.add(person);
		}

		CountDownLatch finishedLatch = new CountDownLatch(1);
		StreamObserver<Greeting> responseObserver = new StreamObserver<Greeting>() {
			@Override
			public void onNext(Greeting value) {

				LOGGER.info("Greet :{}", value.getMessage());
			}

			@Override
			public void onError(Throwable t) {
				LOGGER.info("client err {}", t.getMessage());
				finishedLatch.countDown();
			}

			@Override
			public void onCompleted() {
				LOGGER.info("Finished lotsOfGreetings");
				finishedLatch.countDown();
			}
		};

		StreamObserver<Person> requestObserver = helloWorldServiceStub.bidiHello(responseObserver);
		try {
			// Send numPoints points randomly selected from the features list.
			for (Person person : persons) {
				LOGGER.info("client send {}", person.getFirstName());
				requestObserver.onNext(person);
			}
		} catch (RuntimeException e) {
			LOGGER.info("RuntimeException err {}", e.getMessage());
			requestObserver.onError(e);
			throw e;
		}
		// Mark the end of requests
		requestObserver.onCompleted();

		// Receiving happens asynchronously
		finishedLatch.await(1, TimeUnit.MINUTES);

	}
}

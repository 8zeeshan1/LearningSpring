package com.demo.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner  { // this interface lets me run any functions any services just after my application starts like maybe i need to connect to my db just after my spring application starts or test anything just after the start of the application so we use this interface and implement run method.

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication(UserService svc){
		this.svc = svc;
	}
	final private UserService svc;

	@Override
	public void run(String... args) throws Exception {
		svc.saveUser("Zeeshan");
	}
}

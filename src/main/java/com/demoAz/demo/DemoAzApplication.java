package com.demoAz.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demoAz.demo.Entities.Client;

@SpringBootApplication
public class DemoAzApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoAzApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client (1L, "Aznick");
		Client c2 = new Client (2L, "Aznick Deshayan");
		
		c1.setNome("Aznick Deshayan");
		
		System.out.println("ID=" + c1.getId());
		
		if(c1.equals(c2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
	}

}

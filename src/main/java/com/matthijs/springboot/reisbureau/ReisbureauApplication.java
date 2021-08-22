package com.matthijs.springboot.reisbureau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matthijs.springboot.reisbureau.controller.Reizen;
import com.matthijs.springboot.reisbureau.repository.Reisrepo;

@SpringBootApplication
public class ReisbureauApplication implements CommandLineRunner {
	
	@Autowired
	Reisrepo reisrepo;

	public static void main(String[] args) {
		SpringApplication.run(ReisbureauApplication.class, args);
	}
	
	@Override
	public void run(String[] args) {
		Reizen reis = reisrepo.findById(2).get();
		System.out.println("Wat wordt het dit jaar? " + reis.getBestemming() + " en " + reis.getActiviteiten());
		
	}

}

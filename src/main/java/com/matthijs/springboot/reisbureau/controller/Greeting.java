package com.matthijs.springboot.reisbureau.controller;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
	
	private int aantal;
	private String begroeting;
	
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public String getBegroeting() {
		return begroeting;
	}
	public void setBegroeting(String begroeting) {
		this.begroeting = begroeting;
	}

}

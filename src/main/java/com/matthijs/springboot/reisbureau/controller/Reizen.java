package com.matthijs.springboot.reisbureau.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reizen")
public class Reizen {
	
	@Id
	@Column(name="boekingsnummer")
	private int boekingsnummer;

	@Column(name="bestemming")
	private String bestemming;

	@Column(name="activiteiten")
	private String activiteiten;

	public int getBoekingsnummer() {
		return boekingsnummer;
	}

	public void setBoekingsnummer(int boekingsnummer) {
		this.boekingsnummer = boekingsnummer;
	}

	public String getBestemming() {
		return bestemming;
	}

	public void setBestemming(String bestemming) {
		this.bestemming = bestemming;
	}

	public String getActiviteiten() {
		return activiteiten;
	}

	public void setActiviteiten(String activiteiten) {
		this.activiteiten = activiteiten;
	}
	
}

package com.fellah.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fournisseur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String nom;
	private String email;
	private String adresse;
	public Fournisseur(int id, String nom, String email, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	
}

package com.fellah.api.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agriculteur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	@OneToMany
	ArrayList<Fournisseur> fournisseurList;
	@OneToMany
	ArrayList<Employee> employesList;
	@OneToMany
	ArrayList<Alimentation> alimentationList;
	@OneToMany
	ArrayList<Animal> animalList;
	
	
	public Agriculteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agriculteur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}

package com.fellah.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private Long salaire;
	private int age;
	private String adresse;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String nom, String prenom, Long salaire, int age, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.age = age;
		this.adresse = adresse;
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
	public Long getSalaire() {
		return salaire;
	}
	public void setSalaire(Long salaire) {
		this.salaire = salaire;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}

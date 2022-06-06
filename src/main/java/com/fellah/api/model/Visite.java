package com.fellah.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Visite {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date_visite;
	private Long prix_visite;
	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visite(int id, Date date_visite, Long prix_visite) {
		super();
		this.id = id;
		this.date_visite = date_visite;
		this.prix_visite = prix_visite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_visite() {
		return date_visite;
	}
	public void setDate_visite(Date date_visite) {
		this.date_visite = date_visite;
	}
	public Long getPrix_visite() {
		return prix_visite;
	}
	public void setPrix_visite(Long prix_visite) {
		this.prix_visite = prix_visite;
	}
	
}

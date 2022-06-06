package com.fellah.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimentation_animal {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date_alimentation;
	private int quantite;
	public Alimentation_animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alimentation_animal(int id, Date date_alimentation, int quantite) {
		super();
		this.id = id;
		this.date_alimentation = date_alimentation;
		this.quantite = quantite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_alimentation() {
		return date_alimentation;
	}
	public void setDate_alimentation(Date date_alimentation) {
		this.date_alimentation = date_alimentation;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}

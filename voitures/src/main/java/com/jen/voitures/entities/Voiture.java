package com.jen.voitures.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String MarqueVoiture;
	private Double prixVoiture;
	
	@ManyToOne
	private Personne personne;
	
	public Voiture() {
	super();
	}
	public Voiture(String MarqueVoiture, Double prixVoiture) {
	super();
	this.MarqueVoiture = MarqueVoiture;
	this.prixVoiture = prixVoiture;
	}

	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdProduit(Long idVoiture) {
	this.idVoiture = idVoiture;
	}
	public String getMarqueVoiture() {
	return MarqueVoiture;
	}
	public void setMarqueVoiture(String MarqueVoiture) {
	this.MarqueVoiture = MarqueVoiture;
	}
	public Double getprixVoiture() {
	return prixVoiture;
	}
	public void setprixVoituret(Double prixVoiture) {
	this.prixVoiture = prixVoiture;
	}
	
	@Override
	public String toString() {
	return "Voiture [idVoiture=" + idVoiture + ", MarqueVoiture=" +

MarqueVoiture + ", prixVoiture=" + prixVoiture + "]";

	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	}


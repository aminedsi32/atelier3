package com.jen.voitures.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idPersonne;
private String nomPersonne;
private String prePersonne;
@JsonIgnore
@OneToMany (mappedBy="personne")
private List<Voiture> voitures;
public Personne() {
	super();
	
}
public Long getIdPersonne() {
	return idPersonne;
}
public void setIdPersonne(Long idPersonne) {
	this.idPersonne = idPersonne;
}
public String getNomPersonne() {
	return nomPersonne;
}
public void setNomPersonne(String nomPersonne) {
	this.nomPersonne = nomPersonne;
}
public String getPrePersonne() {
	return prePersonne;
}
public void setPrePersonne(String prePersonne) {
	this.prePersonne = prePersonne;
}
}

package com.jen.voitures.service;

import java.util.List;

import com.jen.voitures.entities.Personne;
import com.jen.voitures.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture p);
	Voiture updateVoiture(Voiture v);
	void deleteVoiture(Voiture v);
	void deleteVoitureById(Long id);
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	
	List<Voiture> findByMarqueVoiture(String marque);
	List<Voiture> findByMarqueVoitureContains(String marque);
	List<Voiture> findByMarquePrix (String marque, Double prix);
	List<Voiture> findByPersonne (Personne personne);
	List<Voiture> findByPersonneIdPers(Long id);
	List<Voiture> findByOrderByMarqueVoitureAsc();
	List<Voiture> trierVoituresMarquePrix();
}

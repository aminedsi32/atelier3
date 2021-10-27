package com.jen.voitures.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jen.voitures.entities.Personne;
import com.jen.voitures.entities.Voiture;
import com.jen.voitures.repos.VoitureRepository;
@Service
public class VoitureServiceImpl implements VoitureService{
	@Autowired
	VoitureRepository voitureRepository;
	@Override
	public Voiture saveVoiture(Voiture v) {
	return voitureRepository.save(v);
	}
	@Override
	public Voiture updateVoiture(Voiture v) {
	return voitureRepository.save(v);
	}
	@Override
	public void deleteVoiture(Voiture v) {
		voitureRepository.delete(v);
	}
	@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);
	}
	@Override
	public Voiture getVoiture(Long id) {
	return voitureRepository.findById(id).get();
	}
	@Override
	public List<Voiture> getAllVoitures() {
	return voitureRepository.findAll();
	}
	
	@Override
	public List<Voiture> findByMarqueVoiture(String marque) {
	return voitureRepository.findByMarqueVoiture(marque);
	}
	@Override
	public List<Voiture> findByMarqueVoitureContains(String nom) {
	return voitureRepository.findByMarqueVoitureContains(nom);
	}
	@Override
	public List<Voiture> findByMarquePrix(String marque, Double prix) {
		return voitureRepository.findByMarquePrix(marque, prix);
	}
	@Override
	public List<Voiture> findByPersonne(Personne personne) {
	return voitureRepository.findByPersonne(personne);
	}
	@Override
	public List<Voiture> findByPersonneIdPers(Long id) {
	return voitureRepository.findByPersonneIdPers(id);
	}
	@Override
	public List<Voiture> findByOrderByMarqueVoitureAsc() {
	return voitureRepository.findByOrderByMarqueVoitureAsc();
	}
	@Override
	public List<Voiture> trierVoituresMarquePrix() {
	return voitureRepository.trierVoituresMarquesPrix();
	}
	}
	



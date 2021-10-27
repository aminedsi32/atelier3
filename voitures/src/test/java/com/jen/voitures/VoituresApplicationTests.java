package com.jen.voitures;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.jen.voitures.entities.Personne;
import com.jen.voitures.entities.Voiture;
import com.jen.voitures.repos.VoitureRepository;
@SpringBootTest
class VoituresApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository;
	@Test
	public void testCreateVoiture() {
	Voiture voit = new Voiture("BMW",150.254);
	voitureRepository.save(voit);
	}
	
	@Test
	public void testFindVoiture()
	{
	Voiture v = voitureRepository.findById(1L).get();

	System.out.println(v);
	}
	@Test
	public void testUpdateVoiture()
	{
	Voiture v = voitureRepository.findById(1L).get();
	v.setprixVoituret(1000.0);
	voitureRepository.save(v);
	}
	@Test
	public void testDeleteVoiture()
	{
	voitureRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousVoitures()
	{
	List<Voiture> voits = voitureRepository.findAll();
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testFindVoitureByMarque()
	{
	List<Voiture> voits = voitureRepository.findByMarqueVoiture("BMW");
			for (Voiture v : voits)
			{
			System.out.println(v);
			}
	
	}
	@Test
	public void testFindVoitureByMarqueContains()
	{
	List<Voiture> voits = voitureRepository.findByMarqueVoitureContains("B");
			for (Voiture v : voits)
			{
			System.out.println(v);
			}
	}
	
	@Test
	public void testFindVoitureByMarquePrix()
	{
	List<Voiture> voits = voitureRepository.findByMarquePrix("BMW",150.200);
			for (Voiture v : voits)
			{
			System.out.println(v);
			}
	}
	
	@Test
	public void testfindByCategorie()
	{
	Personne pers = new Personne();
	pers.setIdPersonne(1L);
	List<Voiture> voits = voitureRepository.findByPersonne(pers);
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	
	@Test
	public void findByPersonneIdPers()
	{
	List<Voiture> voits = voitureRepository.findByPersonneIdPers(1L);
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	
	@Test
	public void testfindByOrderByMarqueVoitureAsc()
	{
	List<Voiture> voits = voitureRepository.findByOrderByMarqueVoitureAsc();
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	
	@Test
	public void testtrierVoituresMarquesPrix()
	{
	List<Voiture> voits = voitureRepository.trierVoituresMarquesPrix();
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	}



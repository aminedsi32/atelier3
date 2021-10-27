package com.jen.voitures.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jen.voitures.entities.Personne;
import com.jen.voitures.entities.Voiture;
@RepositoryRestResource(path = "rest")
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

	List<Voiture> findByMarqueVoiture(String marque);
	List<Voiture> findByMarqueVoitureContains(String marque);
	/*@Query("select v from Voiture v where p.nomVoiture like %?1 and p.prixVoiture > ?2")
	List<Voiture> findByMarquePrix (String marque, Double prix);*/
	
	@Query("select v from Voiture p where p.nomVoiture like %?1 and p.prixVoiture > ?2")
	List<Voiture> findByMarquePrix (@Param("marque") String marque,@Param("prix") Double prix);
	
	@Query("select p from Voiture v where v.personne = ?1")
	List<Voiture> findByPersonne (Personne personne);
	
	List<Voiture> findByPersonneIdPers(long id);
	List<Voiture> findByOrderByMarqueVoitureAsc();
	
	@Query("select v from Voiture v order by p.marqueVoiture ASC, p.prixVoiture DESC")
	List<Voiture> trierVoituresMarquesPrix ();
	
}

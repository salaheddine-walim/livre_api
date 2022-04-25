package com.example.livre_api.service;

import java.util.List;

import com.example.livre_api.entities.Livre;
import com.example.livre_api.repos.LivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.persistence.OrderBy;
import javax.transaction.Transactional;

@Component
public class LivreService {
	
	@Autowired
	private LivreRepo livreRepo;


		//Recuperer tous les livres tries selon le titre en ordre croissant
		public List<Livre> getAllLivres(){
			return livreRepo.findByOrderByTitreAsc();
	}
		
		//Recuperer le livre avec son Id
		public Livre getLivreById(int id) {
			return livreRepo.getById(id);
		}
		
		//Supprimer Livre avec son  Id
		@Transactional
		public void deleteLivreById(int id) {
			livreRepo.deleteById(id);
		}
		
		//Mettre a jour Livre avec son Id
		public Livre updateLivreById(Livre livre, int id) {
			Livre getLivre = livreRepo.getById(id);
			getLivre.setTitre(livre.getTitre());
			getLivre.setDateSortie(livre.getDateSortie());
			getLivre.setAuteur(livre.getAuteur());
			getLivre.setNbrPage(livre.getNbrPage());
			getLivre.setDernierConsultation(livre.getDernierConsultation());
			return livreRepo.save(getLivre);
		}


}

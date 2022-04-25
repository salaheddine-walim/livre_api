package com.example.livre_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.livre_api.entities.Livre;
import com.example.livre_api.service.LivreService;

@RestController
@RequestMapping("/livre_api")
public class LivreController {
	@Autowired
	private LivreService service_livre;

	  //Recuperation des livres
	  @GetMapping("/livres")
	  public List<Livre> getAllLivres() {
		  return service_livre.getAllLivres();
	  }
	
	  //Recuperer un livre avec son id
	  @GetMapping("/livre/{id}")
	  public Livre getLivreById(@PathVariable Integer id) {
		  return service_livre.getLivreById(id);
	  }

	  //Modifier un livre avec son id
	  @PutMapping("/livre/{id}")
	  public Livre updateLivreById(@RequestBody Livre livre, @PathVariable Integer id) {
		  return service_livre.updateLivreById(livre, id);
		}

	  //Supprimer un livre avec son id
	  @DeleteMapping("/livre/{id}")
	  public void deleteLivreById(@PathVariable Integer id) {
		  service_livre.deleteLivreById(id);
	  }
		 
}

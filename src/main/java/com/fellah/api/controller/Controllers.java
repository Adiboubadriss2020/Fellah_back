package com.fellah.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fellah.api.model.Fournisseur;
import com.fellah.api.service.FournisseurService;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
@CrossOrigin
public class Controllers {
	
	
	    @Autowired
	    private FournisseurService fournisseurService;

	    @PostMapping("/add")
	    public String add(@RequestBody Fournisseur fournisseur){
	        fournisseurService.saveFournisseur(fournisseur);
	        return "New fournisseur is added";
	    }

	    @GetMapping("/getAll")
	    public List<Fournisseur> list(){
	        return fournisseurService.getAllFournisseurs();
	    }
	    
		// update employee rest api
		
		/*
		 @PutMapping("/fournisseur/{id}")
		 */
	    /*
		public List<Fournisseur> updateFournisseur(@PathVariable Long id, @RequestBody Fournisseur f1){
			Fournisseur fournisseur = fournisseurService.update(id);			
			fournisseur.setNom(f1.getNom());
			fournisseur.setEmail(f1.getEmail());
			fournisseur.setAdresse(f1.getAdresse());
			
			
			Fournisseur updatedFournisseur = fournisseurService.saveFournisseur(fournisseur);
			return List.of(updatedFournisseur);
		}
		
		// delete employee rest api
		@DeleteMapping("/fournisseur/{id}")
		public String deleted(Long id) {
			Fournisseur f = new Fournisseur();
			fournisseurService.delete(f.getId());
			return "Deleted!";
			}*/
	}
	


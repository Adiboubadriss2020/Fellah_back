package com.fellah.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellah.api.model.Fournisseur;
import com.fellah.api.repository.FournisseurRepository;
import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImp implements FournisseurService {


    @Autowired
    private FournisseurRepository fr;

	@Override
	public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return fr.save(fournisseur);
		
	}

	@Override
	public List<Fournisseur> getAllFournisseurs() {
        return fr.findAll();

	}

	/*@Override
	public List<Fournisseur> update(int id) {
		return fr.findById(id);
	}*/
}

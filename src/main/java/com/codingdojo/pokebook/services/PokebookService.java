package com.codingdojo.pokebook.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.pokebook.models.Pokebook;
import com.codingdojo.pokebook.repositories.PokebookRepo;

@Service
public class PokebookService {
	
	// ******** CONSTRUCTOR ********
	private final PokebookRepo pokebookRepo;
	
	public PokebookService(PokebookRepo pokebookRepo) {
		this.pokebookRepo = pokebookRepo;
	}
	
	// ******** FIND ALL ********
	public List<Pokebook> allPokebooks(){
		return pokebookRepo.findAll();
	}
	
	// ******** CREATE ********
	public Pokebook addPokebook(Pokebook pokebook) {
		return pokebookRepo.save(pokebook);
	}
	
}

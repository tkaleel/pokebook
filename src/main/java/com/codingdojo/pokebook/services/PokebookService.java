package com.codingdojo.pokebook.services;

import java.util.List;
import java.util.Optional;

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
	
	// ******** FIND ONE ********
	public Pokebook findPokebook(Long id) {
		Optional<Pokebook> optionalPokebook = pokebookRepo.findById(id);
		if(optionalPokebook.isPresent()) {
			return optionalPokebook.get();
		} else {
			return null;
		}
	}
	
	// ******** CREATE ********
	public Pokebook addPokebook(Pokebook pokebook) {
		return pokebookRepo.save(pokebook);
	}
	
	// ******** UPDATE ********
	public Pokebook updatePokebook(Pokebook pokebook) {
		return pokebookRepo.save(pokebook);
	}
	
	
	// ******** DELETE *******
	public void deletePokebook(Long id) {
		pokebookRepo.deleteById(id);
	}
}

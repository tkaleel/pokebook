package com.codingdojo.pokebook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.pokebook.models.Pokebook;
import com.codingdojo.pokebook.services.PokebookService;

@Controller
public class HomeController {
	
	@Autowired
	PokebookService pokebookService;
	
	// ******** FIND ALL ********
	@GetMapping("/expenses")
	public String expenses(Model model) {
		List<Pokebook> pokebooks = pokebookService.allPokebooks();
		model.addAttribute("pokebooks", pokebooks);
		return "expenses.jsp";
	}
	
	// ******** FIND ONE ********
	@GetMapping("/expenses/{id}")
	public String showOne(@PathVariable("id") Long id, Model model) {
		Pokebook pokebook = pokebookService.findPokebook(id);
		model.addAttribute("pokebook", pokebook);
		return "showOne.jsp";
	}
	
	// ******** CREATE ********
	@GetMapping("/create")
	public String create(@ModelAttribute("newPokebook")Pokebook newPokebook) {
		return "create.jsp";
	}
	
	@PostMapping("/create")
	public String processCreate(@Valid @ModelAttribute("newPokebook")Pokebook newPokebook, BindingResult result ) {
		if(result.hasErrors()) {
			return "create.jsp";
		} else {
			pokebookService.addPokebook(newPokebook);
			return "redirect:/expenses";
		}	
	}
	
	// ******** UPDATE ********
	@GetMapping("/expenses/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Pokebook pokebook = pokebookService.findPokebook(id);
		model.addAttribute("pokebook", pokebook);
		return "edit.jsp";
	}
	
	@PutMapping("/expenses/{id}/edit")
	public String processEdit(@Valid @ModelAttribute("pokebook")Pokebook pokebook, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			pokebookService.updatePokebook(pokebook);
			return "redirect:/expenses";
		}
	}
	

}

package rpp2023vezbeit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rpp2023vezbeit.model.Artikl;
import rpp2023vezbeit.repository.ArtiklRepository;

@RestController
public class ArtiklRestController {

	@Autowired
	private ArtiklRepository artiklRepository; 
	
	@GetMapping("artikl")
	public Collection<Artikl> getAll() {
		return artiklRepository.findAll();
	}
	
	@GetMapping("artikl/{id}")
	public Artikl getOne(@PathVariable("id") Integer id) {
		Artikl artikl = artiklRepository.getOne(id);
		return artikl;
	};
}

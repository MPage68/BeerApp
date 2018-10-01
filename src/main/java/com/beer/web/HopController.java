package com.beer.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beer.business.hop.Hop;
import com.beer.business.hop.HopRepository;

@Controller
@RequestMapping("/Hop")
public class HopController {

	@Autowired
	private HopRepository hopRepository;

	@GetMapping("/List")
	public @ResponseBody Iterable<Hop> getAllHops() {
		Iterable<Hop> hops = hopRepository.findAll();
		return hops;
	}

	@GetMapping("/Get")
	public @ResponseBody Optional<Hop> getRecipes(@RequestParam int id) {
		Optional<Hop> hop = hopRepository.findById(id);

		return hop;

	}

	@PostMapping("/Add")
	public @ResponseBody Hop addrecipe(@RequestBody Hop hop) {
		return hopRepository.save(hop);

	}

	@PostMapping("/Change")
	public @ResponseBody Hop updateHop(@RequestBody Hop hop) {
		return hopRepository.save(hop);

	}

	@PostMapping("/Remove")
	public @ResponseBody String removeHop(@RequestBody Hop hop) {
		hopRepository.delete(hop);
		return "Hop removed";
	}
}

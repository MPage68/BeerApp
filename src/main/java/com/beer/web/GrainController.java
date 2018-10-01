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

import com.beer.business.grain.Grain;
import com.beer.business.grain.GrainRepository;

@Controller
@RequestMapping("/Grain")
public class GrainController {

	@Autowired
	private GrainRepository grainRepository;

	@GetMapping("/List")
	public @ResponseBody Iterable<Grain> getAllGrains() {
		Iterable<Grain> grains = grainRepository.findAll();
		return grains;
	}

	@GetMapping("/Get")
	public @ResponseBody Optional<Grain> getGrains(@RequestParam int id) {
		Optional<Grain> grain = grainRepository.findById(id);

		return grain;

	}

	@PostMapping("/Add")
	public @ResponseBody Grain addrecipe(@RequestBody Grain grain) {
		return grainRepository.save(grain);

	}

	@PostMapping("/Change")
	public @ResponseBody Grain updateGrain(@RequestBody Grain grain) {
		return grainRepository.save(grain);

	}

	@PostMapping("/Remove")
	public @ResponseBody String removeGrain(@RequestBody Grain grain) {
		grainRepository.delete(grain);
		return "Recipe removed";
	}
}

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

import com.beer.business.yeast.Yeast;
import com.beer.business.yeast.YeastRepository;

@Controller
@RequestMapping("/Yeast")
public class YeastController {

	@Autowired
	private YeastRepository yeastRepository;

	@GetMapping("/List")
	public @ResponseBody Iterable<Yeast> getAllYeast() {
		Iterable<Yeast> yeast = yeastRepository.findAll();
		return yeast;
	}

	@GetMapping("/Get")
	public @ResponseBody Optional<Yeast> getYeast(@RequestParam int id) {
		Optional<Yeast> yeast = yeastRepository.findById(id);

		return yeast;

	}

	@PostMapping("/Add")
	public @ResponseBody Yeast addYeast(@RequestBody Yeast yeast) {
		return yeastRepository.save(yeast);

	}

	@PostMapping("/Change")
	public @ResponseBody Yeast updateYeast(@RequestBody Yeast yeast) {
		return yeastRepository.save(yeast);

	}

	@PostMapping("/Remove")
	public @ResponseBody String removeYeast(@RequestBody Yeast yeast) {
		yeastRepository.delete(yeast);
		return "Yeast removed";
	}
}

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

import com.beer.business.recipe.Recipe;
import com.beer.business.recipe.RecipeRepository;



@Controller
@RequestMapping("/Recipe")
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;

	@GetMapping("/List")
	public @ResponseBody Iterable<Recipe> getAllRecipes() {
		Iterable<Recipe> recipes = recipeRepository.findAll();
		return recipes;
	}

	@GetMapping("/Get")
	public @ResponseBody Optional<Recipe> getRecipes(@RequestParam int id) {
		Optional<Recipe> recipe = recipeRepository.findById(id);

		return recipe;

	}

	@PostMapping("/Add")
	public @ResponseBody Recipe addrecipe(@RequestBody Recipe recipe) {
		return recipeRepository.save(recipe);

	}

	@PostMapping("/Change")
	public @ResponseBody Recipe updateRecipe(@RequestBody Recipe recipe) {
		return recipeRepository.save(recipe);

	}

	@PostMapping("/Remove")
	public @ResponseBody String removeRecipe(@RequestBody Recipe recipe) {
		recipeRepository.delete(recipe);
		return "Recipe removed";
	}
}

package com.example.recipe.controllers;

import com.example.recipe.models.Recipe;
import com.example.recipe.repositories.RecipeJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeRestController {

    @Autowired
    private RecipeJpaRepo recipeJpaRepo;

    @GetMapping("")
    public List<Recipe> listRecipes(){
        return recipeJpaRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Recipe> getRecipe(@PathVariable Long id){
        return recipeJpaRepo.findById(id);
    }

    @PostMapping("")
    public Recipe createRecipe(@RequestBody Recipe recipe){
        return recipeJpaRepo.save(recipe);
    }

    @PutMapping("/{id}")
    public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id){
        Recipe rep = recipeJpaRepo.getById(id);
        rep.setName(recipe.getName());
        rep.setDescription(recipe.getDescription());
        return recipeJpaRepo.save(rep);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id){
        recipeJpaRepo.deleteById(id);
    }
}

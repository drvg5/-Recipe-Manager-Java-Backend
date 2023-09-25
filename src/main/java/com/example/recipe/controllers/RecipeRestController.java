package com.example.recipe.controllers;

import com.example.recipe.models.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeRestController {
    @GetMapping
    public List<Recipe> listRecipes(){
        return null;
    }

    @GetMapping
    public Recipe getRecipe(@PathVariable Long id){

        return null;
    }

    @PostMapping("")
    public Recipe createRecipe(@RequestBody Recipe recipe){

        return null;
    }

    @PutMapping("/{id}")
    public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id){

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id){

    }
}

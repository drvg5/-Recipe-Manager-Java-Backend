package com.example.recipe.repositories;

import com.example.recipe.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeJpaRepo extends JpaRepository<Recipe, Long> {
}

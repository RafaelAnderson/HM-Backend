package com.example.homemade.repository;

import com.example.homemade.model.Ingredient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    Page<Ingredient> findById (Long Id, Pageable pageable);

    Page<Ingredient> findByRecipeId (Long recipeId, Pageable pageable);

    Optional<Ingredient> findByIdAndRecipeId (Long Id, Long recipeId);

}

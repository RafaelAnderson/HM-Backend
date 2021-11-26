package com.example.homemade.service;

import com.example.homemade.model.Ingredient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface IngredientService {

    Ingredient getIngredientById(Long ingredientId);
    Page<Ingredient> GetAllIngredient(Pageable pageable);
    Page<Ingredient> GetAllIngredientByRecipeId(Long recipeId,Pageable pageable);
    Ingredient createIngredient(Long recipeId, Ingredient ingredient);
    Ingredient updateIngredient(Long recipeId, Long ingredientId ,Ingredient ingredient);
    ResponseEntity<?> deleteIngredient (Long recipeId, Long ingredientId);
}

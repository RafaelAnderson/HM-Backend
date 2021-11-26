package com.example.homemade.service;

import com.example.homemade.model.Step;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface StepService {
    Step getStepById (Long stepId);

    Page<Step> getAllStepByRecipeId (Long recipeId, Pageable pageable);

    Step createStep( Long recipeId ,Step step);

    Step updateStep(Long stepId, Step step);

    ResponseEntity<?> deleteStep(Long stepId, Long recipeId );

}

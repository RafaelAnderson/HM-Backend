package com.example.homemade.repository;

import com.example.homemade.model.Step;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepository extends JpaRepository<Step, Long>{
    Page<Step> findByRecipeId(Long recipeId, Pageable pageable);
}

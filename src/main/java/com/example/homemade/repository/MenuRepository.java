package com.example.homemade.repository;

import com.example.homemade.model.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuRepository extends JpaRepository<Menu, Long> {
    Page<Menu> findByUserId(Long userId, Pageable pageable);
}

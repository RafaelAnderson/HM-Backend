package com.example.homemade.repository;

import com.example.homemade.model.UserChef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interfaz pública
@Repository
public interface UserChefRepository extends JpaRepository<UserChef, Long> {

}


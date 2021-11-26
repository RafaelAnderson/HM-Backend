package com.example.homemade.repository;

import com.example.homemade.model.UserNoChef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserNoChefRepository extends JpaRepository<UserNoChef, Long> {
}

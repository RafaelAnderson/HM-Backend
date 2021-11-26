package com.example.homemade.service;

import com.example.homemade.model.UserChef;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface UserChefService {
    Page<UserChef> getAllUserChef(Pageable pageable);

    UserChef getUserChefById(Long userChefId);

    UserChef createUserChef(UserChef userChef);

    UserChef updateUserChef(Long userChefId, UserChef userChefRequest);

    ResponseEntity<?> deleteUserChef(Long userChefId);

    UserChef assignUserChefRecipe(Long userChefId, Long userNoChefId);

    UserChef unassignUserChefRecipe(Long userChefId, Long userNoChefId);
}

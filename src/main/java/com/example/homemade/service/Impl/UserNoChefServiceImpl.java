package com.example.homemade.service.Impl;

import com.example.homemade.exception.ResourceNotFoundException;
import com.example.homemade.model.UserNoChef;
import com.example.homemade.repository.UserNoChefRepository;
import com.example.homemade.service.UserNoChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserNoChefServiceImpl implements UserNoChefService {

    @Autowired
    private UserNoChefRepository userNoChefRepository;

    @Override
    public Page<UserNoChef> getAllUserNoChef(Pageable pageable) {
        return userNoChefRepository.findAll(pageable);
    }

    @Override
    public UserNoChef getUserNoChefById(Long userNoChefId) {
        return userNoChefRepository.findById(userNoChefId).orElseThrow(() -> new ResourceNotFoundException("UserNoChef", "Id", userNoChefId));
    }

    @Override
    public UserNoChef createUserNoChef(UserNoChef userNoChef) {
        return userNoChefRepository.save(userNoChef);
    }

    @Override
    public UserNoChef updateUserNoChef(Long userNoChefId, UserNoChef userNoChefRequest) {
        return userNoChefRepository.findById(userNoChefId).map(userNoChef -> {
            userNoChef.setName(userNoChefRequest.getName());
            userNoChef.setLastName(userNoChefRequest.getLastName());
            userNoChef.setPassword(userNoChefRequest.getPassword());
            userNoChef.setEmail(userNoChefRequest.getEmail());
            userNoChef.setGender(userNoChefRequest.getGender());
            userNoChef.setDateOfBirth(userNoChefRequest.getDateOfBirth());
            userNoChef.setProfilePicture(userNoChefRequest.getProfilePicture());
            return userNoChefRepository.save(userNoChef);
        }).orElseThrow(() -> new ResourceNotFoundException("UserChef", "Id", userNoChefId));
    }

    @Override
    public ResponseEntity<?> deleteUserNoChef(Long userNoChefId) {
        return userNoChefRepository.findById(userNoChefId).map(userNoChef -> {
            userNoChefRepository.delete(userNoChef);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("UserNoChef", "Id", userNoChefId));
    }
}

package com.higgsup.service;

import com.higgsup.model.User;
import com.higgsup.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(User user){
        return userRepository.authenticate(user);
    }
}

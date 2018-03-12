package com.higgsup.repository;

import com.higgsup.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public boolean authenticate(User user){
        if(user.getUsername().equals(user.getPassword())){
            return false;
        }
        return true;
    }
}

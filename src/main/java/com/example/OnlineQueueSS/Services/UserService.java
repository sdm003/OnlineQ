package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Entity.User;
import com.example.OnlineQueueSS.Repo.UserRepo;

import java.util.List;

public class UserService {
    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User findeUserById(Long id){
        return userRepo.findById(id).get();
    }
    public List<User> findAllUsers(){
        return userRepo.findAll();
    }
    public User registration(User user){
        return userRepo.save(user);
    }

}

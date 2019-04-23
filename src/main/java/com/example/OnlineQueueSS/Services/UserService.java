package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Models.Queue;
import com.example.OnlineQueueSS.Models.User;
import com.example.OnlineQueueSS.Repo.UserRepo;

import javax.jws.soap.SOAPBinding;
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

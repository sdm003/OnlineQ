package com.example.OnlineQueueSS.Services;


import com.example.OnlineQueueSS.Entity.User;
import com.example.OnlineQueueSS.Model.Message;
import com.example.OnlineQueueSS.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User findeUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<Message> registration(User user) {
        if(!findAllUsers().contains(user)){
           userRepository.save(user);
           return new ResponseEntity(Message.OK, HttpStatus.OK);
        }

        return new ResponseEntity(Message.ERROR, HttpStatus.BAD_REQUEST);
    }
}

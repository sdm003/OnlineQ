package com.example.OnlineQueueSS.Services;


import com.example.OnlineQueueSS.Entity.User;
import com.example.OnlineQueueSS.Model.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    User findeUserById(Long id);
    List<User> findAllUsers();
    ResponseEntity<Message> registration(User user);

}

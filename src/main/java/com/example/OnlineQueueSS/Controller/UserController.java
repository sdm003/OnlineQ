package com.example.OnlineQueueSS.Controller;

import com.example.OnlineQueueSS.Entity.User;
import com.example.OnlineQueueSS.Model.Message;
import com.example.OnlineQueueSS.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/registration")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getClientById(@PathVariable Long id){
        return userService.findeUserById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Message> getRegistration(@RequestBody User user){
        return userService.registration(user);
    }
}
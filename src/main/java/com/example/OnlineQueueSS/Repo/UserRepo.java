package com.example.OnlineQueueSS.Repo;

import com.example.OnlineQueueSS.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}

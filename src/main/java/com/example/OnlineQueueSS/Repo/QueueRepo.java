package com.example.OnlineQueueSS.Repo;

import com.example.OnlineQueueSS.Entity.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueueRepo extends JpaRepository<Queue,Long > {
}

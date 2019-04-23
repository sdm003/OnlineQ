package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Repo.QueueRepo;
import com.example.OnlineQueueSS.Repo.UserRepo;

public class QueueService {
    QueueRepo queueRepo;
    UserRepo userRepo;

    public QueueService(QueueRepo queueRepo, UserRepo userRepo) {
        this.queueRepo = queueRepo;
        this.userRepo = userRepo;
    }

}

package com.example.OnlineQueueSS.Models;

import javax.persistence.*;

@Entity
@Table(name="queue")
public class Queue {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

@ManyToOne
    @JoinColumn(name= "fillial_id")
   private Fillial fillial;

@ManyToOne
    @JoinColumn(name="user_id")
private  User user;

    public Queue(Fillial fillial, User user) {
        this.fillial = fillial;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fillial getFillial() {
        return fillial;
    }

    public void setFillial(Fillial fillial) {
        this.fillial = fillial;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

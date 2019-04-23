package com.example.OnlineQueueSS.Entity;

import com.example.OnlineQueueSS.Model.Section;

import javax.persistence.*;
import java.time.LocalDateTime;

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
@JoinColumn(name="section_id")
private Section section;

@ManyToOne
    @JoinColumn(name="user_id")
private  User user;
private String isUsed;
private LocalDateTime whenTaked;
private  LocalDateTime whenUsed;

    public Queue(Fillial fillial, Section section, User user) {
        this.fillial = fillial;
        this.section = section;
        this.user = user;
        this.whenTaked = LocalDateTime.now();
        this.isUsed="Waiting";
    }

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

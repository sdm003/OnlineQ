package com.example.OnlineQueueSS.Model;

import com.example.OnlineQueueSS.Entity.Fillial;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @NotNull
    String name;
    @ManyToMany
    @JoinColumn(name="fillial_id")
    Fillial fillial;

    public Section(@NotNull String name, Fillial fillial) {
        this.name = name;
        this.fillial = fillial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fillial getFillial() {
        return fillial;
    }

    public void setFillial(Fillial fillial) {
        this.fillial = fillial;
    }
}

package com.example.OnlineQueueSS.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="fillial")
public class Fillial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @NotNull
    String name;
    @NotNull
    String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Fillial(@NotNull String name, @NotNull String address, Department department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    @ManyToOne
    @JoinColumn(name="department_id")
    Department department;
}

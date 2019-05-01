package com.example.OnlineQueueSS.Bootstrap;

import com.example.OnlineQueueSS.Entity.Category;
import com.example.OnlineQueueSS.Entity.Department;
import com.example.OnlineQueueSS.Entity.Fillial;
import com.example.OnlineQueueSS.Services.DepartmentService;
import com.example.OnlineQueueSS.Services.FillialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootFillialDepartment implements CommandLineRunner {
    @Autowired
    private FillialService fillialService;
    @Autowired
    private DepartmentService departmentService;

    @Override
    public void run(String... args) throws Exception {
        Category category = new Category("BANKS");
        Department department1 = new Department("DemiBank", category);
        Department department2 = new Department("Optima", category);
        Department department3 = new Department("PCK", category);
        Fillial fillial1 = new Fillial("HEAD", "BishkekPark", department1);
        Fillial fillial2 = new Fillial("HEAD", "Ala Archa", department2);
        Fillial fillial3 = new Fillial("HEAD", "Asia Mall", department3);
    }
}
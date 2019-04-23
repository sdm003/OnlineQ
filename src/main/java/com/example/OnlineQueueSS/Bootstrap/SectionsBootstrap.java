package com.example.OnlineQueueSS.Bootstrap;

import com.example.OnlineQueueSS.Entity.Category;
import com.example.OnlineQueueSS.Entity.Department;
import com.example.OnlineQueueSS.Entity.Fillial;
import com.example.OnlineQueueSS.Model.Section;

public class SectionsBootstrap {
    public static void main(String[] args) {
        Category category= new Category("BANKS");
        Department department= new Department("DemiBank",category);
        Fillial fillial= new Fillial("HEAD","BishkekPark",department);

        Section sectionOne= new Section("KASSA",fillial);
        Section sectionTwo= new Section("FIZ",fillial);
        Section sectionThree= new Section("YUR",fillial);

    }
}

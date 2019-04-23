package com.example.OnlineQueueSS.Bootstrap;

import com.example.OnlineQueueSS.Models.Category;
import com.example.OnlineQueueSS.Models.Department;
import com.example.OnlineQueueSS.Models.Fillial;
import com.example.OnlineQueueSS.Models.Section;

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

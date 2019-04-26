package com.example.OnlineQueueSS.Bootstrap;

import com.example.OnlineQueueSS.Model.Section;
import com.example.OnlineQueueSS.Repo.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SectionBootstrap implements CommandLineRunner {
    @Autowired
    private SectionRepository sectionRepository;


    @Override
    public void run(String... args) throws Exception {
        Section sectionOne = new Section();
        sectionOne.setName("KASSA");
        sectionRepository.save(sectionOne);

        Section sectionTwo = new Section();
        sectionTwo.setName("FIZ");
        sectionRepository.save(sectionTwo);

        Section sectionThree = new Section();
        sectionThree.setName("YUR");
        sectionRepository.save(sectionThree);


    }
}

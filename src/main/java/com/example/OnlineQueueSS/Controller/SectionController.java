package com.example.OnlineQueueSS.Controller;

import com.example.OnlineQueueSS.Model.Section;
import com.example.OnlineQueueSS.Services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/section")
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @GetMapping("/section")
    public List<Section> getAllSection() {
        return sectionService.getAllSection();
    }

    @GetMapping("/section/{sectionId}")
    public Section getSectionById(@PathVariable Long sectionId) {
        return sectionService.getSectionById(sectionId);
    }

    @DeleteMapping("/removeSection/{sectionId}")
    public void removeSection(@PathVariable Long sectionId) {
        sectionService.removeSection(sectionId);
    }

    @PostMapping("/addSection")
    @ResponseStatus(HttpStatus.CREATED)
    public Section addSection(@RequestBody Section section) {
        return sectionService.addSection(section);
    }

    @PutMapping("/updateSection/{sectionId}")
    public ResponseEntity<?> updateSection(@RequestBody Section section, @PathVariable Long sectionId) {
        Section currentSection = sectionService.changeSection(section, sectionId);
        currentSection.setName(section.getName());
        sectionService.changeSection(currentSection, sectionId);
        return new ResponseEntity<Section>(currentSection, HttpStatus.OK);
    }
}

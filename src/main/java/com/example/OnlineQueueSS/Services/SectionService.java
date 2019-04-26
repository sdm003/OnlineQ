package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Model.Section;

import java.util.List;

public interface SectionService {
    Section addSection(Section section);

    void removeSection(Long sectionId);

    Section changeSection(Section section, Long sectionId);

    List<Section> getAllSection();

    Section getSectionById(Long sectionId);


}

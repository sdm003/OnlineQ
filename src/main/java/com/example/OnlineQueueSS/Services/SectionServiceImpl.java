package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Model.Section;
import com.example.OnlineQueueSS.Repo.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public Section addSection(Section section) {
        return sectionRepository.save(section);
    }

    @Override
    public void removeSection(Long sectionId) {
        sectionRepository.deleteById(sectionId);
    }

    @Override
    public Section changeSection(Section section, Long sectionId) {
        Section sectionUpdate = sectionRepository.findById(sectionId).get();
        return sectionRepository.save(sectionUpdate);
    }

    @Override
    public List<Section> getAllSection() {
        return sectionRepository.findAll();
    }

    @Override
    public Section getSectionById(Long sectionId) {
        return sectionRepository.findById(sectionId).get();
    }
}


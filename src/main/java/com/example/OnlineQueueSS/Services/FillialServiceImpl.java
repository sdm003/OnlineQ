package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Entity.Fillial;
import com.example.OnlineQueueSS.Repo.FillialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FillialServiceImpl implements FillialService {
    @Autowired
    private FillialRepository fillialRepository;

    @Override
    public Fillial addFillial(Fillial fillial) {
        return fillialRepository.save(fillial);
    }

    @Override
    public List<Fillial> getAllFillial() {
        return fillialRepository.findAll();
    }

    @Override
    public Fillial confirmFillial(Long fillialId) {
        return fillialRepository.findById(fillialId).get();
    }


    @Override
    public Fillial getFillialById(Long fillialId) {
        return fillialRepository.findById(fillialId).get();
    }

    @Override
    public void updateFillial(Long fillial) {
        fillialRepository.delete(getFillialById(fillial));

    }


}

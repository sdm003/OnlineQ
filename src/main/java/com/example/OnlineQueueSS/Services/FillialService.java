package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Entity.Fillial;

import java.util.List;

public interface FillialService {
    Fillial addFillial(Fillial fillial);

    List<Fillial> getAllFillial();
    Fillial confirmFillial(Long fillialId);
    Fillial getFillialById(Long fillialId);
    void updateFillial(Long department);


}
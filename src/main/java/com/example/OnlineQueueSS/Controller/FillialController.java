package com.example.OnlineQueueSS.Controller;

import com.example.OnlineQueueSS.Entity.Fillial;
import com.example.OnlineQueueSS.Services.FillialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/fillial")
public class FillialController {
    @Autowired
    private FillialService fillialService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Fillial addFillial(@RequestBody Fillial c) {
        return fillialService.addFillial(c);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    private Fillial changeFillial(@RequestBody Long l) {
        return fillialService.confirmFillial(l);
    }

    @GetMapping
    private List<Fillial> getAllFillial() {
        return fillialService.getAllFillial();
    }

    @GetMapping("{id}")
    private Fillial getFilial(@PathVariable Long id) {
        return fillialService.getFillialById(id);
    }

    @DeleteMapping("/fillial/{id}")
    void deleteEmployee(@PathVariable Long id) {
        fillialService.updateFillial(id);
    }


}
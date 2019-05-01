package com.example.OnlineQueueSS.Controller;

import com.example.OnlineQueueSS.Entity.Department;
import com.example.OnlineQueueSS.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Department addDepartment(@RequestBody Department c) {
        return departmentService.addDepartment(c);
    }

    @PutMapping("/confirm/{id}")
    public Department confirmDepart(@PathVariable Long c) {
        return departmentService.getDepartmentById(c);
    }


    @GetMapping("/department")
    private List<Department> getAllDepartmnet() {
        return departmentService.getAllDepartment();
    }

    @GetMapping("{id}")
    private Department getDepartment(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping("/fillial/{id}")
    void deleteEmployee(@PathVariable Long id) {
        departmentService.updateDepart(id);
    }

}
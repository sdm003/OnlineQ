package com.example.OnlineQueueSS.Services;


import com.example.OnlineQueueSS.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(Department department);

    List<Department> getAllDepartment();

    Department getDepartmentById(Long depatrmentId);
    void updateDepart(Long department);

}
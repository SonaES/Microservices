package com.UST.Departmentservice.controller;


import com.UST.Departmentservice.entity.Department;
import com.UST.Departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService services;
    @PostMapping("/")
    public Department SaveDepartmentById(@RequestBody Department department ){
        return services.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId ){
        return services.findDepartmentById(departmentId);
    }

}

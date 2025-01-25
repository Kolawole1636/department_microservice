package com.department.departmentservice.controller;


import com.department.departmentservice.model.Department;
import com.department.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("department/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("newdepartment")
    public Department createDepartment(@RequestBody Department department){

        return departmentService.createDepartment(department);
    }


    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable int id){

        return departmentService.getDepartment(id);
    }




}

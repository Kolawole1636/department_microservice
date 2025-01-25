package com.department.departmentservice.service;


import com.department.departmentservice.model.Department;
import com.department.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department createDepartment(Department department) {

        return departmentRepository.save(department);

    }



    public Department getDepartment(int id) {

        return departmentRepository.findById(id).get();
    }
}

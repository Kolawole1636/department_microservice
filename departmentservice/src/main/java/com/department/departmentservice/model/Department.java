package com.department.departmentservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String hod;
    private int numberOfStaff;


    public Department() {
    }

    public Department(String name, String hod, int numberOfStaff) {
        this.name = name;
        this.hod = hod;
        this.numberOfStaff = numberOfStaff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hod='" + hod + '\'' +
                ", numberOfStaff=" + numberOfStaff +
                '}';
    }
}

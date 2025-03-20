package com.example.Inheritance.InheritanceDemo.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends User{
    private double psp;
    private String batch;
}

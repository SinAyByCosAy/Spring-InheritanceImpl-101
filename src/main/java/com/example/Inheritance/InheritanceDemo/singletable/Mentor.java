package com.example.Inheritance.InheritanceDemo.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_mentor")
public class Mentor extends User {
    private double avgRating;
}

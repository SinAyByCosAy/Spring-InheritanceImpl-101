package com.example.Inheritance.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.id.uuid.UuidGenerator;

import java.util.UUID;

public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private String name;
    private int age;

}

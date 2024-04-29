package com.example.Inheritance.models;

import jakarta.persistence.*;
import org.hibernate.id.uuid.UuidGenerator;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private String name;
    private int age;

}

package com.example.Inheritance.models;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "player_id")
public class Bots extends Players {
    @Column(name = "`rank`")
    private int rank;

}
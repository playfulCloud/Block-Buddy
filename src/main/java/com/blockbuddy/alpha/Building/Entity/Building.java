package com.blockbuddy.alpha.Building.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;



}

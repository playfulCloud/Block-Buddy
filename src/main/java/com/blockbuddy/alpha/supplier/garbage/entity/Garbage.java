package com.blockbuddy.alpha.supplier.garbage.entity;

import jakarta.persistence.*;

@Entity
public class Garbage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

   @Column(name = "name")
   public String name;


}

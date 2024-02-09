package com.blockbuddy.alpha.electricitySupplier;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "electricity")
@NoArgsConstructor
@AllArgsConstructor
public class Electricity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


   @Column(name = "name")
   private String name;

   @Column(name = "pricePerKWh")
    private double price;


}

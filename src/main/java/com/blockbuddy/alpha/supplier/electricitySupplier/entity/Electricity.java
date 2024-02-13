package com.blockbuddy.alpha.supplier.electricitySupplier.entity;

import com.blockbuddy.alpha.building.entity.Building;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
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

    @ManyToOne
    @JoinColumn(name = "building_id")
    @JsonBackReference
    private Building building;


}

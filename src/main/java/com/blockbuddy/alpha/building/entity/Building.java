package com.blockbuddy.alpha.building.entity;

import com.blockbuddy.alpha.supplier.electricitySupplier.entity.Electricity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "buildings")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private List<Basement> basements;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private List<ParkingSpace> parkingSpaces;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "building")
    private List<Electricity> electricityProviders;

}

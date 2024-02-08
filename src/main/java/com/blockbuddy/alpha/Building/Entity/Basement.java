package com.blockbuddy.alpha.Building.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "basements")
public class Basement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "basement_id")
    private int id;

    @Column(name = "building_number")
    private int basementNumber;

    @Column(name = "area")
    private int area;

    @ManyToOne
    @JoinColumn(name = "building_id")
    @JsonBackReference
    private Building building;

}

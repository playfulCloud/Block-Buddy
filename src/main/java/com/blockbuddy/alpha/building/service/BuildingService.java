package com.blockbuddy.alpha.building.service;

import com.blockbuddy.alpha.building.entity.Building;

import java.util.List;
import java.util.Optional;

public interface BuildingService {
    List<Building> findAll();
    Optional<Building> findById(int id);
    Building save(Building Building);
    String deleteById(int id);
    Optional<Building> findByName(String name);
}

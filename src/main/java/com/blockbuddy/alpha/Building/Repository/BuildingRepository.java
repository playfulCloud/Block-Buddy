package com.blockbuddy.alpha.Building.Repository;

import com.blockbuddy.alpha.Building.Entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {
    Optional<Building> findByName(String name);
}

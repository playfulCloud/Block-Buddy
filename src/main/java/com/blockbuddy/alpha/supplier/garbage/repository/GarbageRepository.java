package com.blockbuddy.alpha.supplier.garbage.repository;

import com.blockbuddy.alpha.building.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarbageRepository extends JpaRepository<Building, Integer> {
}

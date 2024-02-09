package com.blockbuddy.alpha.electricitySupplier.Repository;


import com.blockbuddy.alpha.electricitySupplier.Entity.Electricity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricityRepository extends JpaRepository<Electricity, Integer> {
}

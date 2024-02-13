package com.blockbuddy.alpha.supplier.electricitySupplier.repository;


import com.blockbuddy.alpha.supplier.electricitySupplier.entity.Electricity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricityRepository extends JpaRepository<Electricity, Integer> {
}

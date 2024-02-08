package com.blockbuddy.alpha.Building.Service;

import com.blockbuddy.alpha.Building.Entity.Building;
import com.blockbuddy.alpha.Building.Repository.BuildingRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingServiceImpl implements BuildingService {

    private final BuildingRepository buildingRepository;

    public BuildingServiceImpl(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    @Override
    public List<Building> findAll() {
        return buildingRepository.findAll();
    }

    @Override
    public Optional<Building> findById(int id) {
        Optional<Building> flat = buildingRepository.findById(id);
        if (flat.isPresent()) {
            return flat;
        } else {
            throw new RuntimeException("dupa blada");
        }
    }

    @Override
    @Transactional
    public Building save(Building building) {
        return buildingRepository.save(building);
    }

    @Override
    public String deleteById(int id) {
        buildingRepository.deleteById(id);
        return "Building deleted";
    }

    @Override
    public Optional<Building> findByName(String name) {
        return buildingRepository.findByName(name);
    }
}

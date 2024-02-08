package com.blockbuddy.alpha;

import com.blockbuddy.alpha.Building.Entity.Building;
import com.blockbuddy.alpha.Building.Repository.BuildingRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DatabaseInit {

    private final BuildingRepository buildingRepository;

    @PostConstruct
    public void init(){
        var buildingToSave = Building.builder().name("Blok A").build();
        buildingRepository.save(buildingToSave);
    }
}

package com.blockbuddy.alpha.building.controller;

import com.blockbuddy.alpha.building.entity.Building;
import com.blockbuddy.alpha.building.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BuildingController {

    private final BuildingService buildingService;

    @GetMapping("/buildings")
    public ResponseEntity<List<Building>> findAll(){
        return ResponseEntity.ok(buildingService.findAll());
    }

    @PostMapping("/buildings")
    public ResponseEntity<Building>create(@RequestBody Building building){
        buildingService.save(building);
        return ResponseEntity.ok(building);
    }
}

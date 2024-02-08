package com.blockbuddy.alpha.Building.Controller;

import com.blockbuddy.alpha.Building.Entity.Building;
import com.blockbuddy.alpha.Building.Service.BuildingService;
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

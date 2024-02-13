package com.blockbuddy.alpha.utils;
import com.blockbuddy.alpha.building.entity.Address;
import com.blockbuddy.alpha.building.entity.Basement;
import com.blockbuddy.alpha.building.entity.Building;
import com.blockbuddy.alpha.building.entity.ParkingSpace;
import com.blockbuddy.alpha.building.service.BuildingService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Component
public class DatabaseInit {

    private final BuildingService buildingService;

    @PostConstruct
    public void init() {

        for (int i = 0; i < 10; i++) {

            Building buildingToSave = Building.builder()
                    .name("Blok " + (i + 1))
                    .build();

            Address address = Address.builder()
                    .street("ul. Długa " + i)
                    .city("Kraków")
                    .region("Małopolskie")
                    .build();

            List<Basement> basements = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                Basement basement = Basement.builder()
                        .area((new Random().nextInt(15) + 6) * (j + 1))
                        .basementNumber(j + 1)
                        .building(buildingToSave)
                        .build();
                basements.add(basement);
            }

            List<ParkingSpace> parkingSpaces = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                ParkingSpace parkingSpace = ParkingSpace.builder()
                        .number(j + 1)
                        .apartmetId(j + 1)
                        .building(buildingToSave)
                        .build();
                parkingSpaces.add(parkingSpace);
            }

            buildingToSave.setParkingSpaces(parkingSpaces);
            buildingToSave.setBasements(basements);
            buildingToSave.setAddress(address);
            buildingService.save(buildingToSave);
        }

    }
}

package com.example.cabbookingapplication.exp1_BuilderDP.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class LocationDistance {
    private String source;
    private String destination;
    private double distance;

    public static List<LocationDistance> initializeLocationDistance() {
        LocationDistance locationDistance1 = new LocationDistance("L1", "L2", 10);
        LocationDistance locationDistance2 = new LocationDistance("L1", "L3", 15);
        LocationDistance locationDistance3 = new LocationDistance("L2", "L3", 20);
        List<LocationDistance> listLocationDistance = new ArrayList<LocationDistance>();
        listLocationDistance.add(locationDistance1);
        listLocationDistance.add(locationDistance2);
        listLocationDistance.add(locationDistance3);
        return listLocationDistance;

    }

}

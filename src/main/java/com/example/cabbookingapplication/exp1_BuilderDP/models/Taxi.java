package com.example.cabbookingapplication.exp1_BuilderDP.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Taxi extends BaseModel {
    TaxiStatus taxiStatus;
    static List<Taxi> listTaxi = new ArrayList<Taxi>();

    public Taxi(double v, String taxidriver1, TaxiStatus taxiStatus) {
        super.setId(v);
        super.setName(taxidriver1);
        this.taxiStatus = taxiStatus;
    }

   // public static List<Taxi> initializeTaxis() {
    static{
        Taxi taxi = new Taxi(1D, "Taxidriver1", TaxiStatus.FREE);
        Taxi taxi1 = new Taxi(2D, "Taxidriver2", TaxiStatus.FREE);
        Taxi taxi2 = new Taxi(3D, "Taxidriver3", TaxiStatus.FREE);

        listTaxi.add(taxi);
        listTaxi.add(taxi1);
        listTaxi.add(taxi2);


    }

    public static List<Taxi> getCurrentTaxis(){
        return listTaxi;
    }

    public static void updateTaxi(Taxi taxi) {
        listTaxi.stream().filter(s -> s.getId() == taxi.getId()).forEach(a -> a.setTaxiStatus(taxi.getTaxiStatus()));

    }
}

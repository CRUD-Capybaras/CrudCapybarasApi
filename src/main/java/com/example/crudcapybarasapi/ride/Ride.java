package com.example.crudcapybarasapi.ride;

import com.example.crudcapybarasapi.BaseEntity;
import com.example.crudcapybarasapi.vehicle.Vehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "rides")
public class Ride extends BaseEntity {


    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private String frequency;
    @ManyToMany(mappedBy = "rides", fetch = FetchType.LAZY)
    private List<Vehicle> vehicles;

}

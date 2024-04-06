package com.example.crudcapybarasapi.vehicle;

import com.example.crudcapybarasapi.BaseEntity;
import com.example.crudcapybarasapi.ride.Ride;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "vehicles")
@Data
public class Vehicle extends BaseEntity {

    @ManyToMany
    private List<Ride> rides;

    private Enum<VehicleType> type;
}

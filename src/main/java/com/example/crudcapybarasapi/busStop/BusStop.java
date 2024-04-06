package com.example.crudcapybarasapi.busStop;

import com.example.crudcapybarasapi.BaseEntity;
import com.example.crudcapybarasapi.city.City;
import com.example.crudcapybarasapi.ride.Ride;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "bus_stops")
@Data
public class BusStop extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToMany
    private List<Ride> rides;
}

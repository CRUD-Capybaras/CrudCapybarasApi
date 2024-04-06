package com.example.crudcapybarasapi.city;

import com.example.crudcapybarasapi.BaseEntity;
import com.example.crudcapybarasapi.busStop.BusStop;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "cities")
@Data
public class City extends BaseEntity {

    private String name;
    private String zone;
    private String zipCode;

    @OneToMany(mappedBy = "city")
    private List<BusStop> busStops;
}

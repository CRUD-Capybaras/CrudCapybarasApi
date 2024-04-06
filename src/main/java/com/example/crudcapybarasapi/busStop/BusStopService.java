package com.example.crudcapybarasapi.busStop;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BusStopService {

    private final BusStopRepository busStopRepository;

    public List<BusStop> getBusStops() {
        return busStopRepository.findAll();
    }

    public BusStop getBusStop(String busStopId) {
        return busStopRepository.findById(UUID.fromString(busStopId)).orElse(null);
    }

    public BusStop createBusStop(BusStop busStop) {
        return busStopRepository.save(busStop);
    }

    public BusStop updateBusStop(String busStopId, BusStop busStop) {
        return busStopRepository.findById(UUID.fromString(busStopId))
                .map(existingBusStop -> {
                    existingBusStop.setName(busStop.getName());
                    busStopRepository.save(existingBusStop);
                    return existingBusStop;
                })
                .orElse(null);
    }

    public void deleteBusStop(String busStopId) {
        busStopRepository.deleteById(UUID.fromString(busStopId));
    }
}

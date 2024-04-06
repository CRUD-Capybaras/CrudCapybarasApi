package com.example.crudcapybarasapi.busStop;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/busStops")
public class BusStopController {

    private final BusStopService busStopService;

    @GetMapping
    public List<BusStop> getBusStops() {
        return busStopService.getBusStops();
    }

    @GetMapping("/{busStopId}")
    public BusStop getBusStop(@PathVariable String busStopId) {
        return busStopService.getBusStop(busStopId);
    }

    @PostMapping
    public BusStop createBusStop(@RequestBody BusStop busStop) {
        return busStopService.createBusStop(busStop);
    }

    @PutMapping("/{busStopId}")
    public BusStop updateBusStop(@PathVariable String busStopId, @RequestBody BusStop busStop) {
        return busStopService.updateBusStop(busStopId, busStop);
    }

    @DeleteMapping("/{busStopId}")
    public void deleteBusStop(@PathVariable String busStopId) {
        busStopService.deleteBusStop(busStopId);
    }
}

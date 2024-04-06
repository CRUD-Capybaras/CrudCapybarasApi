package com.example.crudcapybarasapi.city;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @GetMapping
    public List<City> getCities() {
        return cityService.getCities();
    }

    @GetMapping("/{cityId}")
    public City getCity(@PathVariable String cityId) {
        return cityService.getCity(cityId);
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.createCity(city);
    }

    @PutMapping("/{cityId}")
    public City updateCity(@PathVariable String cityId, @RequestBody City city) {
        return cityService.updateCity(cityId, city);
    }

    @DeleteMapping("/{cityId}")
    public void deleteCity(@PathVariable String cityId) {
        cityService.deleteCity(cityId);
    }
}

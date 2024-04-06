package com.example.crudcapybarasapi.city;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public List<City> getCities() {
        return cityRepository.findAll();
    }

    public City getCity(String cityId) {
        return cityRepository.findById(UUID.fromString(cityId)).orElse(null);
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public City updateCity(String cityId, City city) {
        return cityRepository.findById(UUID.fromString(cityId))
                .map(existingCity -> {
                    existingCity.setName(city.getName());
                    cityRepository.save(existingCity);
                    return existingCity;
                })
                .orElse(null);
    }

    public void deleteCity(String cityId) {
        cityRepository.deleteById(UUID.fromString(cityId));
    }
}

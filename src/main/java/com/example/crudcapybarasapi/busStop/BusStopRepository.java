package com.example.crudcapybarasapi.busStop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BusStopRepository extends JpaRepository<BusStop, UUID> {
}

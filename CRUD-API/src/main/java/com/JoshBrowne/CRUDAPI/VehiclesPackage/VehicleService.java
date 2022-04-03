package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

public interface VehicleService {
    //CRUD functions:
    Vehicle creatVehicle(Vehicle vehicle);
    List<Vehicle> retrieveAllVehicles();
    Optional<Vehicle> retrieveVehicleByID(Long id);
    Vehicle updateRoute(Long id, Vehicle vehicle);
    HttpStatus deleteRoute(Long id);
}
package com.JoshBrowne.CRUDAPI.DriversPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

public interface DriverService {

    //CRUD functions:
    Driver creatDriver(Driver route);
    List<Driver> retrieveAllDrivers();
    Optional<Driver> retrieveDriverByID(Long id);
    Driver updateDriver(Long id, Driver route);
    HttpStatus deleteDriver(Long id);

        
    // Query functions: (part 2 of given task)
    List<Driver> getDriversByRouteID(Long routeId);
}
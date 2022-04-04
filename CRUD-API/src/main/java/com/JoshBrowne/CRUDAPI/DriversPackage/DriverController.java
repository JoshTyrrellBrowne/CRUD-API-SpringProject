package com.JoshBrowne.CRUDAPI.DriversPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DriverController {
    
    @Autowired
    private DriverServiceImplementation driverServiceImplementation;

    @GetMapping("/drivers")
    public List<Driver> getAllDrivers() {
        return driverServiceImplementation.retrieveAllDrivers();
    }

    @GetMapping("/driver/{id}")
    public Optional<Driver> getDriverById(@PathVariable Long id) {
        return driverServiceImplementation.retrieveDriverByID(id);
    }

    @PostMapping("/driver")
    public Driver createRoute(@RequestBody Driver driver) {
        return driverServiceImplementation.creatDriver(driver);
    }

    @PutMapping("/driver/{id}")
    public Driver updatDriver(@PathVariable Long id, @RequestBody Driver driver) {
        driver.setDriverId(id);
        return driverServiceImplementation.updateDriver(id, driver);
    }

    @DeleteMapping("/driver/{id}")
    public HttpStatus deleteDriver(@PathVariable Long id) {
        return driverServiceImplementation.deleteDriver(id);
    }
}

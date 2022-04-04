package com.JoshBrowne.CRUDAPI.VehiclesPackage;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VehicleController {
    
    @Autowired
    private VehicleServiceImplementation vehicleServiceImplementation;

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicleServiceImplementation.retrieveAllVehicles();
    }
    @GetMapping("/vehicles/driverId")
    public List<Vehicle> getVehiclesWithDriverId(@RequestParam("driverId") Long driverId) {
        System.out.print(driverId);
        return vehicleServiceImplementation.retrieveVehiclesWithDriverId(driverId);
    }

    @GetMapping("vehicle/{id}")
    public Optional<Vehicle> getVehicleById(@PathVariable Long id) {
        System.out.print(id);
        return vehicleServiceImplementation.retrieveVehicleByID(id);
    }

    @PostMapping("/vehicle")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleServiceImplementation.creatVehicle(vehicle);
    }

    @PutMapping("/vehicle/{id}")
    public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        return vehicleServiceImplementation.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/vehicle/{id}")
    public HttpStatus deleteVehicle(@PathVariable Long id) {
        return vehicleServiceImplementation.deleteVehicle(id);
    }

}

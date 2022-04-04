package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VehicleServiceImplementation implements VehicleService{


    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle creatVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public HttpStatus deleteVehicle(Long id) {
        Optional<Vehicle> flag = vehicleRepository.findById(id);
        if (flag.isPresent()) {
            vehicleRepository.deleteById(id);
            return HttpStatus.OK;
        }
        else {
            return HttpStatus.NOT_FOUND;
        }    
    }

    @Override
    public List<Vehicle> retrieveAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> retrieveVehicleByID(Long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        Optional<Vehicle> flag = vehicleRepository.findById(id);
        if (flag.isPresent()) {
            Vehicle newFlag = flag.get();
            newFlag.setVehicleId(vehicle.getVehicleId());
            newFlag.setDriverId(vehicle.getDriverId());

            return vehicleRepository.save(newFlag);
        }
        return null;
    }

    @Override
    public List<Vehicle> retrieveVehiclesWithDriverId(Long driverId) {
        return vehicleRepository.retrieveDriverById(driverId);
    }

    // my code that didnt work...
    //@Override
    //public List<Vehicle> retrieveVehiclesWithDriverId(Long driverId) {
    //    List<Vehicle> allVehicles = vehicleRepository.findAll();
    //    List<Vehicle> vehiclesWithDriverId = new ArrayList<Vehicle>();
    //    for (Vehicle vehicle : allVehicles) {
    //        if (vehicle.getDriverId() == driverId) {
    //            vehiclesWithDriverId.add(vehicle);
    //        }
    //    }
    //    return vehiclesWithDriverId;
    //}
    
    
}

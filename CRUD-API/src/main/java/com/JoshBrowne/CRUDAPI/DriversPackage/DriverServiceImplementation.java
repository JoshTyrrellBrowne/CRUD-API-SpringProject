package com.JoshBrowne.CRUDAPI.DriversPackage;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DriverServiceImplementation implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver creatDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public HttpStatus deleteDriver(Long id) {
        Optional<Driver> flag = driverRepository.findById(id);
        if (flag.isPresent()) {
            driverRepository.deleteById(id);
            return HttpStatus.OK;
        }
        else {
            return HttpStatus.NOT_FOUND;
        }       
    }

    @Override
    public List<Driver> retrieveAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Optional<Driver> retrieveDriverByID(Long id) {
        return driverRepository.findById(id);
    }

    @Override
    public Driver updateDriver(Long id, Driver driver) {
        Optional<Driver> flag = driverRepository.findById(id);
        if (flag.isPresent()) {
            Driver newFlag = flag.get();
            newFlag.setId(driver.getId());
            newFlag.setFirstName(driver.getFirstName());
            newFlag.setLastName(driver.getLastName());

            return driverRepository.save(newFlag);
        }
        return null;
    }
    
}

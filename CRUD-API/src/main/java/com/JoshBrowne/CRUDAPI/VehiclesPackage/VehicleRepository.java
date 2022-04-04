package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
    @Query(value = "FROM Vehicle WHERE driverId = ?1")
    public List<Vehicle> retrieveDriverById(Long driverId);

}

package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
}

package com.JoshBrowne.CRUDAPI.DriversPackage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {  // JB NOTE: JpaRepository<Route, Long> --> Driver: the model, Long: the primary key or id type
    
}

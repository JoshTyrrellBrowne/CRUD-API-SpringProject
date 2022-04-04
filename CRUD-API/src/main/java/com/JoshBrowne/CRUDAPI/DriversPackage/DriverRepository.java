package com.JoshBrowne.CRUDAPI.DriversPackage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface DriverRepository extends JpaRepository<Driver, Long> {  // JB NOTE: JpaRepository<Route, Long> --> Driver: the model, Long: the primary key or id type
    
    @Transactional
    @Modifying  
    @Query("SELECT d FROM Driver d JOIN d.vehicle v JOIN v.routes r WHERE r.routeId = ?1" )
    public List<Driver> getDriversByRoute(Long routeId);
}

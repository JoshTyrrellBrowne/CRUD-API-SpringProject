package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {
    @Id
    @Column
    private Long vehicleId;
    @Column
    private Long driverId;  // foreign key for Driver table
    
    

    //Constructors:
    public Vehicle() {
    }

    public Vehicle(Long vehicleId, Long driverId) {
        this.vehicleId = vehicleId;
        this.driverId = driverId;
    }
    
    //Setters & Getters:
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Vehicle [driverId=" + driverId + ", vehicleId=" + vehicleId + "]";
    }

}

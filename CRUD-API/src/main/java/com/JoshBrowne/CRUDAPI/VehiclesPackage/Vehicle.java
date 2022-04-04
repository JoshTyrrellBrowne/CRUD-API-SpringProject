package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.JoshBrowne.CRUDAPI.DriversPackage.Driver;
import com.JoshBrowne.CRUDAPI.RoutesPackage.Route;

@Entity(name = "Vehicle")
@Table(name = "Vehicles")
public class Vehicle {
    @Id
    @Column
    private Long vehicleId;
    @Column(name = "driverId")
    private Long driverId;  // foreign key for Driver table
    

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "driverId", referencedColumnName = "driverId", insertable = false, updatable=false)
    //public Driver driver;

    @OneToMany(mappedBy = "vehicleId", cascade = CascadeType.ALL)
    public Set<Route> routes = new HashSet<>();

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

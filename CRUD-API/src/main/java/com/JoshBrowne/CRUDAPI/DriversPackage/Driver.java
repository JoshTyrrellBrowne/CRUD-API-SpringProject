package com.JoshBrowne.CRUDAPI.DriversPackage;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.JoshBrowne.CRUDAPI.VehiclesPackage.Vehicle;

@Entity
@Table(name = "Driver")
public class Driver implements Serializable {
    @Id
    @Column
    private Long driverId;
    @Column
    private String firstName;
    @Column
    private String lastName;

    @ManyToOne( cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "driverId", insertable = false, updatable=false)
    public Vehicle vehicle =  new Vehicle();

    //Constructors:
    public Driver() {
    }
    public Driver(Long driverId, String firstName, String lastName) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Driver(Long driverId, String firstName, String lastName, Vehicle vehicle) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    //Getters & Setters:
    public Long getDriverId() {
        return driverId;
    }
    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //display all fields, used for testing & debugging
    @Override
    public String toString() {
        return "Driver [driverId=" + driverId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    
}

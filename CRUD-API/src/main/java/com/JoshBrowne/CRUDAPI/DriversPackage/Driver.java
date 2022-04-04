package com.JoshBrowne.CRUDAPI.DriversPackage;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.JoshBrowne.CRUDAPI.VehiclesPackage.Vehicle;

@Entity
@Table(name = "Drivers")
public class Driver {
    @Id
    @Column
    private Long driverId;
    @Column
    private String firstName;
    @Column
    private String lastName;

    @OneToOne(mappedBy = "driverId", cascade = CascadeType.ALL)
    @JoinColumn(name = "driverId")
    public Vehicle vehicle;

    //Constructors:
    public Driver() {
    }
    public Driver(Long driverId, String firstName, String lastName) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
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

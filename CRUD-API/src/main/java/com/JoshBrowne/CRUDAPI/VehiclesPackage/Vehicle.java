package com.JoshBrowne.CRUDAPI.VehiclesPackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column
    private Long id;

    @Column
    private Long vehicleId;

    @Column
    private Long driverId;

    
}

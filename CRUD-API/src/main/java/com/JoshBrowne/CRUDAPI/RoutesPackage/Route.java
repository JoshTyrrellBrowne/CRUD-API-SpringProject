package com.JoshBrowne.CRUDAPI.RoutesPackage;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.JoshBrowne.CRUDAPI.VehiclesPackage.Vehicle;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "Routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column
    private Long id;
    @Column
    private Long routeId;
    @Column
    private Long vehicleId;  // foreign key for Vehicle table
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")  //to remove milliseconds
    private Timestamp startTime;
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Timestamp endTime;

    @ManyToOne
    @JoinColumn(name = "vehicleId", insertable = false, updatable=false)
    public Vehicle vehicle;

    // Constructor:
    public Route(Long id, Long routeId, Long vehicleId, Timestamp startTime, Timestamp endTime) {
        this.id = id;
        this.routeId = routeId;
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public Route() {
    }


    // Getters & Setters:
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getRouteId() {
        return routeId;
    }
    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }
    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public Timestamp getStartTime() {
        return startTime;
    }
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
    public Timestamp getEndTime() {
        return endTime;
    }
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Route [endTime=" + endTime + ", id=" + id + ", routeId=" + routeId + ", startTime=" + startTime
                + ", vehicleId=" + vehicleId + "]";
    }

}

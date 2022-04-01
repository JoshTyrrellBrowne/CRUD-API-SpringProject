//package com.JoshBrowne.CRUDAPI.RoutesPackage;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import org.hibernate.annotations.Table;
//
//
//@Entity
//@Table
//public class Route {
//
//    private Long id;
//    private Long routeId;
//    private Long vehicleId;
//    private Timestamp startTime;
//    private Timestamp endTime;
//
//    // Constructor:
//    public Route(Long id, Long routeId, Long vehicleId, Timestamp startTime, Timestamp endTime) {
//        
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        this.id = id;
//
//        @Column
//        this.routeId = routeId;
//        @Column
//        this.vehicleId = vehicleId;
//        @Column
//        this.startTime = startTime;
//        @Column
//        this.endTime = endTime;
//    }
//    
//    // Getters & Setters:
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public Long getRouteId() {
//        return routeId;
//    }
//    public void setRouteId(Long routeId) {
//        this.routeId = routeId;
//    }
//    public Long getVehicleId() {
//        return vehicleId;
//    }
//    public void setVehicleId(Long vehicleId) {
//        this.vehicleId = vehicleId;
//    }
//    public Timestamp getStartTime() {
//        return startTime;
//    }
//    public void setStartTime(Timestamp startTime) {
//        this.startTime = startTime;
//    }
//    public Timestamp getEndTime() {
//        return endTime;
//    }
//    public void setEndTime(Timestamp endTime) {
//        this.endTime = endTime;
//    }
//
//    @Override
//    public String toString() {
//        return "Route [endTime=" + endTime + ", id=" + id + ", routeId=" + routeId + ", startTime=" + startTime
//                + ", vehicleId=" + vehicleId + "]";
//    }
//    
//    
//}

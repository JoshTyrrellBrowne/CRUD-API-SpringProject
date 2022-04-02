package com.JoshBrowne.CRUDAPI.RoutesPackage;

import org.springframework.data.jpa.repository.JpaRepository;



public interface RouteRepository extends JpaRepository<Route, Long> {  // JB NOTE: JpaRepository<Route, Long> --> Route: the model, Long: the primary key or id type
    
}

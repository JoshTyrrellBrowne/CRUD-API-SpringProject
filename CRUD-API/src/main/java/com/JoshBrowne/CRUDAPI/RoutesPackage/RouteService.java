package com.JoshBrowne.CRUDAPI.RoutesPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

public interface RouteService {

    //CRUD functions:
    Route creatRoute(Route route);
    List<Route> retrieveAllRoutes();
    Optional<Route> retrieveRouteByID(Long id);
    Route updateRoute(Long id, Route route);
    HttpStatus deleteRoute(Long id);
    
}

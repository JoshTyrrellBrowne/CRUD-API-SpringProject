package com.JoshBrowne.CRUDAPI.RoutesPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RouteController {

    @Autowired
    private RouteServiceImplementation routeServiceImplementation;

    // Example mapping:
    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", "World", "It's", "Josh");
    }

    @GetMapping("/routes")
    public List<Route> getAllRoutes() {
        return routeServiceImplementation.retrieveAllRoutes();
    }

    @GetMapping("/route/{id}")
    public Optional<Route> getRouteById(@PathVariable Long id) {
        return routeServiceImplementation.retrieveRouteByID(id);
    }

    @PostMapping("/route")
    public Route createRoute(@RequestBody Route route) {
        return routeServiceImplementation.creatRoute(route);
    }

    @PutMapping("/route/{id}")
    public Route updatRoute(@PathVariable Long id, @RequestBody Route route) {
        route.setId(id);
        return routeServiceImplementation.updateRoute(id, route);
    }

    @DeleteMapping("/route/{id}")
    public HttpStatus deleteRoute(@PathVariable Long id) {
        return routeServiceImplementation.deleteRoute(id);
    }
}

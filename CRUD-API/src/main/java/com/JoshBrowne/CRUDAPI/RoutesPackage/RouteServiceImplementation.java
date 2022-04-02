package com.JoshBrowne.CRUDAPI.RoutesPackage;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RouteServiceImplementation implements RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Route creatRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public HttpStatus deleteRoute(Long id) {
        Optional<Route> flag = routeRepository.findById(id);
        if (flag.isPresent()) {
            routeRepository.deleteById(id);
            return HttpStatus.OK;
        }
        else {
            return HttpStatus.NOT_FOUND;
        }       
    }

    @Override
    public List<Route> retrieveAllRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Optional<Route> retrieveRouteByID(Long id) {
        return routeRepository.findById(id);
    }

    @Override
    public Route updateRoute(Long id, Route route) {
        Optional<Route> flag = routeRepository.findById(id);
        if (flag.isPresent()) {
            Route newFlag = flag.get();
            newFlag.setId(route.getId());
            newFlag.setRouteId(route.getRouteId());
            newFlag.setVehicleId(route.getVehicleId());
            newFlag.setStartTime(route.getStartTime());
            newFlag.setEndTime(route.getEndTime());

            return routeRepository.save(newFlag);
        }
        return null;
    }
    
}

package com.JoshBrowne.CRUDAPI.RoutesPackage;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RouteController {
    
    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", "World", "It's", "Josh");
    }
}

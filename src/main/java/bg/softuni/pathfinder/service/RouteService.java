package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.entities.Route;
import bg.softuni.pathfinder.reporistory.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    private RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public List<Route> getMostCommented(){
       return routeRepository.findMostCommentedRoute();
    }
}

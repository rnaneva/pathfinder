package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.entities.Route;
import bg.softuni.pathfinder.service.RouteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    private RouteService routeService;

    @Autowired
    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model){

        Route route = routeService.getMostCommented().get().get(0);
        model.addAttribute("mostCommented", route);

        return "index";
    }



}

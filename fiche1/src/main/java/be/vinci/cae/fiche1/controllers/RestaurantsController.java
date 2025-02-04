package be.vinci.cae.fiche1.controllers;

import be.vinci.cae.fiche1.Restaurant;
import be.vinci.cae.fiche1.services.RestaurantsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class RestaurantsController {
    private final RestaurantsService restaurantsService;

    public RestaurantsController(RestaurantsService restaurantsService) {
        this.restaurantsService = restaurantsService;
    }

    @GetMapping({"/", ""})
    public Iterable<Restaurant> all(@RequestParam(required = false) String cuisine) {
        if (cuisine == null || cuisine.isEmpty()) {
            return restaurantsService.getAllRestaurants();
        } else {
            return restaurantsService.getRestaurantsByCuisine(cuisine);
        }
    }

}

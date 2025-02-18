package be.vinci.cae.fiche2.controllers;

import be.vinci.cae.fiche2.models.FoodTruck;
import be.vinci.cae.fiche2.services.FoodTrucksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodtrucks")
public class FoodTrucksController {

    private final FoodTrucksService foodTrucksService;

    public FoodTrucksController(FoodTrucksService foodTrucksService) {
        this.foodTrucksService = foodTrucksService;
    }

    @GetMapping("/")
    public Iterable<FoodTruck> getFoodTrucks() {
        return foodTrucksService.getAllFoodTrucks();
    }

    @GetMapping("/{id}")
    public FoodTruck getFoodTruckById(@PathVariable Long id) {
        return foodTrucksService.getFoodTruck(id);
    }
}

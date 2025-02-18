package be.vinci.cae.fiche2.services;

import be.vinci.cae.fiche2.models.FoodTruck;
import be.vinci.cae.fiche2.repositories.FoodTrucksRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodTrucksService {

    private final FoodTrucksRepository foodTrucksRepository;

    public FoodTrucksService(FoodTrucksRepository foodTrucksRepository) {
        this.foodTrucksRepository = foodTrucksRepository;
    }

    public Iterable<FoodTruck> getAllFoodTrucks() {
        return foodTrucksRepository.findAll();
    }

    public FoodTruck getFoodTruck(long id) {
        return foodTrucksRepository.findById(id).orElse(null);
    }
}

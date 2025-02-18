package be.vinci.cae.fiche2.repositories;

import be.vinci.cae.fiche2.models.FoodTruck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodTrucksRepository extends CrudRepository<FoodTruck, Long> {
    FoodTruck findByName(String name);
    Optional<FoodTruck> findById(Long id);
}

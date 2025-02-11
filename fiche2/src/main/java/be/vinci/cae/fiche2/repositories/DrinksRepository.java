package be.vinci.cae.fiche2.repositories;

import be.vinci.cae.fiche2.models.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrinksRepository extends CrudRepository<Drink, Long> {
    Drink findByName(String name);
    Optional<Drink> findById(Long id);

}
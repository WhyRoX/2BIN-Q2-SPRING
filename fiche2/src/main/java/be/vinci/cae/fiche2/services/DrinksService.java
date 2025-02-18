package be.vinci.cae.fiche2.services;

import be.vinci.cae.fiche2.models.Drink;
import be.vinci.cae.fiche2.repositories.DrinksRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinksService {

    private final DrinksRepository drinksRepository;

    public DrinksService(DrinksRepository drinksRepository) {
        this.drinksRepository = drinksRepository;
    }

    public Iterable<Drink> getAllDrinks() {
        return drinksRepository.findAll();
    }

    public Drink getDrink(long id) {
        return drinksRepository.findById(id).orElse(null);
    }

    public Drink createDrink(Drink drink) {
        return drinksRepository.save(drink);
    }

    public void deleteDrink(long id) {
        drinksRepository.deleteById(id);
    }

    public Drink updateDrink(long id, Drink drink) {
        Optional<Drink> existingDrink = drinksRepository.findById(id);
        if (existingDrink.isPresent()) {
            Drink updatedDrink = existingDrink.get();
            updatedDrink.setName(drink.getName());
            updatedDrink.setDescription(drink.getDescription());
            updatedDrink.setPrice(drink.getPrice());
            updatedDrink.setAlcoholic(drink.getAlcoholic());
            return drinksRepository.save(updatedDrink);
        } else {
            return drinksRepository.save(drink);
        }
    }

}
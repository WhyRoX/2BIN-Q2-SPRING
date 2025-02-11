package be.vinci.cae.fiche2.controllers;

import be.vinci.cae.fiche2.models.Drink;
import be.vinci.cae.fiche2.services.DrinksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drinks")
public class DrinksController {
    private DrinksService drinksService;

    public DrinksController(DrinksService drinksService) {
        this.drinksService = drinksService;
    }

    @GetMapping("/")
    public Iterable<Drink> getDrinks() {
        return drinksService.getAllDrinks();
    }

    @GetMapping("/{id}")
    public Drink getDrinkById(@PathVariable Long id) {
        return drinksService.getDrink(id);
    }
}
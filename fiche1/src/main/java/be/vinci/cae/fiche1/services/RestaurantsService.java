package be.vinci.cae.fiche1.services;

import be.vinci.cae.fiche1.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantsService {
    private final List<Restaurant> restaurants = List.of(
            new Restaurant("Comme Chez Soi", "Française"),
            new Restaurant("Le Chalet de la Forêt", "Belge"),
            new Restaurant("La Villa Lorraine", "Française"),
            new Restaurant("Belga Queen", "Belge"),
            new Restaurant("Bia Mara", "Fish"),
            new Restaurant("Aux Armes de Bruxelles", "Belge"),
            new Restaurant("Noordzee Mer du Nord", "Poisson"),
            new Restaurant("Fin de Siècle", "Européenne"),
            new Restaurant("Bon Bon", "Française"),
            new Restaurant("La Quincaillerie", "Belge"),
            new Restaurant("Café Georgette", "Belge"),
            new Restaurant("Amadeus", "Ribs"),
            new Restaurant("Le Pain Quotidien", "Bio"),
            new Restaurant("The Sister Brussels Café", "Végétarienne"),
            new Restaurant("Certo", "Italienne"),
            new Restaurant("Brugmann", "Française"),
            new Restaurant("Chez Léon", "Belge"),
            new Restaurant("Yi Chan", "Asiatique"),
            new Restaurant("Kamo", "Japonaise"),
            new Restaurant("Humus x Hortense", "Végétarienne")
    );

    public List<Restaurant> getAllRestaurants() {
        return restaurants.stream()
                .limit(10)
                .collect(Collectors.toList());
    }

    public List<Restaurant> getRestaurantsByCuisine(String cuisine) {
        return restaurants.stream()
                .filter(restaurant -> restaurant.getType_cuisine().equalsIgnoreCase(cuisine))
                .limit(10)
                .collect(Collectors.toList());
    }
}
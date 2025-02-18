package be.vinci.cae.fiche2.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "food_trucks")
public class FoodTruck {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String adresse;

    @OneToMany(mappedBy = "foodTruck")
    @JsonManagedReference
    private List<Drink> drinks;

    public FoodTruck(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }
}

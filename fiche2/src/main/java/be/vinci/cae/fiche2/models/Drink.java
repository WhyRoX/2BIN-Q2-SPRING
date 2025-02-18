package be.vinci.cae.fiche2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "drinks")
public class Drink {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private float price;

    private Boolean alcoholic;

    @ManyToOne
    @JsonBackReference
    private FoodTruck foodTruck;

    public Drink(String name, String description, float price, boolean alcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholic = alcoholic;
    }

    public Drink(String name, String description, float price, boolean alcoholic, FoodTruck foodTruck) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholic = alcoholic;
        this.foodTruck = foodTruck;
    }
}
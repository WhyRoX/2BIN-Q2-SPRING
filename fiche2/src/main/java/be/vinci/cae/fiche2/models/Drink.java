package be.vinci.cae.fiche2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    public Drink(String name, String description, float price, boolean alcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholic = alcoholic;
    }
}
package org.store.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="items")
public class Item {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="model", nullable = false)
    private String model;
    @Column(name="brand", nullable = false)
    private String brand;
    @Column(name="price", nullable = false)
    private int price;

    public Item(String name, String model, String brand, Integer price) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
}
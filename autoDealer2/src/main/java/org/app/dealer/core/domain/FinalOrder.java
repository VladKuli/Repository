package org.app.dealer.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="final_order")
public class FinalOrder {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="car")
    private Car car;
    @Column(name="price", nullable = false)
    private Integer price;

    public FinalOrder(Car car, Integer price) {
        this.car = car;
        this.price = price;
    }
}
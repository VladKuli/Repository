package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaCarRepository;
import org.app.dealer.core.database.jpa.JpaFinalOrderRepository;
import org.app.dealer.core.domain.Car;
import org.app.dealer.core.domain.FinalOrder;
import org.app.dealer.core.requests.AddFinalOrderRequest;
import org.app.dealer.core.responses.AddFinalOrderResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class AddFinalOrderService {

    @Autowired
    private JpaFinalOrderRepository repository;
    @Autowired
    private JpaCarRepository carRepository;

    public AddFinalOrderResponses execute(AddFinalOrderRequest request) {
        List<Car> cars = carRepository.findAll();
        int result = cars.size();
        Car car = cars.get(result - 1);
        int price;
        if (car.isItPremiumCar()) {
            price = 100000;
        } else {
            price = 50000;
        }
        FinalOrder finalOrder = new FinalOrder(car,price);
        return new AddFinalOrderResponses(finalOrder);
    }
}
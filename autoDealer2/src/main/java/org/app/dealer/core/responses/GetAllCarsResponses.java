package org.app.dealer.core.responses;


import org.app.dealer.core.domain.Car;
import java.util.List;


public class GetAllCarsResponses {

    private List<Car> cars;


    public GetAllCarsResponses(List<Car> cars) {
        this.cars = cars;
    }
}
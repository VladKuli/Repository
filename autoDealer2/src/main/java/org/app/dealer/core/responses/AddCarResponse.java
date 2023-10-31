package org.app.dealer.core.responses;

import org.app.dealer.core.domain.Car;

import java.util.List;

public class AddCarResponse extends CoreResponse {

    private Car car;

    public AddCarResponse(List<CoreError> errors) {
        super(errors);
    }

    public AddCarResponse(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
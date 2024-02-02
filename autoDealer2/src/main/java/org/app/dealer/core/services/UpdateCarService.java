package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaCarRepository;
import org.app.dealer.core.requests.UpdateCarRequest;
import org.app.dealer.core.responses.UpdateCarResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UpdateCarService {

    @Autowired
    private JpaCarRepository repository;

    public UpdateCarResponse execute(UpdateCarRequest request) {
        repository.findById(request.getId()).map(car ->  {
            car.setModel(request.getNewModel());
            car.setHorsePower(request.getNewHorsePower());
            car.setItPremiumCar(request.isNewStatusIsItPremiumCar());
            return new UpdateCarResponse(car);
        });
        return new UpdateCarResponse();

    }
}
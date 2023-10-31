package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaCarRepository;
import org.app.dealer.core.database.jpa.JpaModificationsInfoRepository;
import org.app.dealer.core.domain.Car;
import org.app.dealer.core.domain.ModificationsInfo;
import org.app.dealer.core.requests.AddCarRequest;
import org.app.dealer.core.requests.AddModificationsInfoRequest;
import org.app.dealer.core.responses.AddCarResponse;
import org.app.dealer.core.responses.AddModificationsInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
@Transactional
public class AddCarService {

    @Autowired
    private JpaCarRepository repository;
    @Autowired
    private JpaModificationsInfoRepository infoRepository;

    public AddCarResponse execute(AddCarRequest request) {
        List<ModificationsInfo> infoList = infoRepository.findAll();
        int result = infoList.size();
        ModificationsInfo info;
        info = infoList.get(result-1);
        Car car = new Car(info,
                request.getModel(),
                request.getHorsepower(),
                request.isItPremiumCar());
        return new AddCarResponse(car);
    }
}
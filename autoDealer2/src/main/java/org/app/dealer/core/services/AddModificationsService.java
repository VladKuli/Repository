package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaModificationsInfoRepository;
import org.app.dealer.core.domain.ModificationsInfo;
import org.app.dealer.core.requests.AddModificationsInfoRequest;
import org.app.dealer.core.responses.AddModificationsInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class AddModificationsService {


    @Autowired
    private JpaModificationsInfoRepository repository;


    public AddModificationsInfoResponse execute(AddModificationsInfoRequest request) {
        ModificationsInfo info = new ModificationsInfo(request.isHaveModifiedEngine(),
                request.isHaveSportExhaust(),
                request.isHaveTurboTune(),
                request.isHaveSportExterior(),
                request.isItPremiumCar());
        repository.save(info);
        return new AddModificationsInfoResponse(info);
    }
}
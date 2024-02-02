package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaCarRepository;
import org.app.dealer.core.requests.GetAllCarsRequest;
import org.app.dealer.core.responses.GetAllCarsResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class GetAllCarsService {

    @Autowired
    private JpaCarRepository repository;

    public GetAllCarsResponses execute(GetAllCarsRequest request) {
        return new GetAllCarsResponses(repository.findAll());
    }
}
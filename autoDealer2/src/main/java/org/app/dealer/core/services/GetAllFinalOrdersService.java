package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaFinalOrderRepository;
import org.app.dealer.core.requests.GetAllFinalOrdersRequest;
import org.app.dealer.core.responses.GetAllFinalOrdersResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class GetAllFinalOrdersService {

    @Autowired
    private JpaFinalOrderRepository repository;

    public GetAllFinalOrdersResponses execute(GetAllFinalOrdersRequest request) {
        return new GetAllFinalOrdersResponses(repository.findAll());
    }
}
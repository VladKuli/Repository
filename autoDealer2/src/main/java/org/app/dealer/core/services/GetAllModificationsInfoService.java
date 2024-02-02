package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaModificationsInfoRepository;
import org.app.dealer.core.requests.GetAllModificationsInfoRequest;
import org.app.dealer.core.responses.GetAllModificationsInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class GetAllModificationsInfoService {

    @Autowired
    private JpaModificationsInfoRepository repository;

    public GetAllModificationsInfoResponse execute(GetAllModificationsInfoRequest request) {
        return new GetAllModificationsInfoResponse(repository.findAll());
    }
}
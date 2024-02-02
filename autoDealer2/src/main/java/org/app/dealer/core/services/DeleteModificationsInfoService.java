package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaModificationsInfoRepository;
import org.app.dealer.core.requests.DeleteModificationsInfoRequest;
import org.app.dealer.core.responses.DeleteModificationsInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeleteModificationsInfoService {

    @Autowired
    private JpaModificationsInfoRepository repository;

    public DeleteModificationsInfoResponse execute(DeleteModificationsInfoRequest request) {
        repository.deleteById(request.getId());
        return new DeleteModificationsInfoResponse();
    }
}
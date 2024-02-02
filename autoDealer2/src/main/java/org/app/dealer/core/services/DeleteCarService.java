package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaCarRepository;
import org.app.dealer.core.requests.DeleteCarRequest;
import org.app.dealer.core.responses.DeleteCarResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeleteCarService {

    @Autowired
    private JpaCarRepository repository;

    public DeleteCarResponse execute(DeleteCarRequest request) {
        repository.deleteById(request.getId());
        return new DeleteCarResponse();
    }
}
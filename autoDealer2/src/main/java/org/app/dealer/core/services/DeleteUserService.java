package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaUserRepository;
import org.app.dealer.core.requests.DeleteUserRequest;
import org.app.dealer.core.responses.DeleteFinalOrderResponse;
import org.app.dealer.core.responses.DeleteUserResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeleteUserService {

    @Autowired
    private JpaUserRepository repository;

    public DeleteUserResponses execute(DeleteUserRequest request) {
        repository.deleteById(request.getId());
        return new DeleteUserResponses();
    }
}
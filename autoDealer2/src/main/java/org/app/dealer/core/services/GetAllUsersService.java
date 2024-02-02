package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaUserRepository;
import org.app.dealer.core.requests.GetAllUsersRequest;
import org.app.dealer.core.responses.GetAllUsersResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class GetAllUsersService {

    @Autowired
    private JpaUserRepository repository;

    public GetAllUsersResponses execute(GetAllUsersRequest request) {
        return new GetAllUsersResponses(repository.findAll());
    }

}
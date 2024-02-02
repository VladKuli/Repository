package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaUserRepository;
import org.app.dealer.core.domain.User;
import org.app.dealer.core.requests.AddUserRequest;
import org.app.dealer.core.responses.AddUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class AddUserService {

    @Autowired
    private JpaUserRepository repository;

    public AddUserResponse execute(AddUserRequest request) {
        User user = new User(request.getLogin(),request.getPassword());
        return new AddUserResponse(user);
    }
}
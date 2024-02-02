package org.app.dealer.core.responses;

import lombok.Getter;
import org.app.dealer.core.domain.User;

import java.util.List;

@Getter
public class GetAllUsersResponses {

    private List<User> users;

    public GetAllUsersResponses(List<User> users) {
        this.users = users;
    }
}
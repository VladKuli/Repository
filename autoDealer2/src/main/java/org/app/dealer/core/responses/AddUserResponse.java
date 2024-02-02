package org.app.dealer.core.responses;

import org.app.dealer.core.domain.User;

import java.util.List;

public class AddUserResponse extends CoreResponse{

    private User user;

    public AddUserResponse(List<CoreError> errorList) {
        super(errorList);
    }

    public AddUserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
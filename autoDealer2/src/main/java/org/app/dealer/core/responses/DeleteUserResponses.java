package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.User;

import java.util.List;

@Getter
@NoArgsConstructor
public class DeleteUserResponses extends CoreResponse {

    private User deletedUser;

    public DeleteUserResponses(List<CoreError> errors) {
        super(errors);
    }

    public DeleteUserResponses(User deletedUser) {
        this.deletedUser = deletedUser;
    }
}
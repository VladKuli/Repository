package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.User;

import java.util.List;

@Getter
@NoArgsConstructor
public class UpdateUserResponse extends CoreResponse {

    private User updatedUser;

    public UpdateUserResponse(List<CoreError> errors) {
        super(errors);
    }
}

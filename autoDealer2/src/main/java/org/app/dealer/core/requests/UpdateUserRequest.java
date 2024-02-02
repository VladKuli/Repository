package org.app.dealer.core.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.User;

@Getter
@NoArgsConstructor
public class UpdateUserRequest {

    private Long id;
    private String newLogin;
    private String newPassword;

    public UpdateUserRequest(Long id) {
        this.id = id;
    }
}

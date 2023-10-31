package org.app.dealer.core.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddUserRequest {

    private String login;
    private String password;
}
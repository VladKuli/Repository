package org.app.dealer.core.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteUserRequest {

    private Long id;
    private String login;

    public DeleteUserRequest(Long id) {
        this.id = id;
    }

    public DeleteUserRequest(String login) {
        this.login = login;
    }
}
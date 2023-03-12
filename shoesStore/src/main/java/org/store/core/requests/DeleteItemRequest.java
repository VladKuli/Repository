package org.store.core.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DeleteItemRequest {

    private Long id;

    private String name;

    public DeleteItemRequest(Long id) {
        this.id = id;
    }

    public DeleteItemRequest(String name) {
        this.name = name;
    }
}
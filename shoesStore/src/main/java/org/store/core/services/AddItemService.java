package org.store.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;
import org.store.core.database.jpa.JpaItemRepository;
import org.store.core.domain.Item;
import org.store.core.requests.AddItemRequest;
import org.store.core.responses.AddItemResponse;

@Component
public class AddItemService {

    @Autowired
    private JpaItemRepository repository;

    public AddItemResponse execute(AddItemRequest request) {
        Item item = new Item(request.getName(), request.getModel(), request.getBrand(),
                request.getPrice());
        repository.save(item);
        return new AddItemResponse(true);
    }
}

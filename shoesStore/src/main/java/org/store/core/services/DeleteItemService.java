package org.store.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.store.core.database.jpa.JpaItemRepository;
import org.store.core.domain.Item;
import org.store.core.requests.DeleteItemRequest;
import org.store.core.responses.DeleteItemResponse;

import java.util.Optional;

@Component
public class DeleteItemService {

    @Autowired
    private JpaItemRepository jpaItemRepository;

    public DeleteItemResponse execute(DeleteItemRequest request) {
        jpaItemRepository.deleteById(request.getId());
        Optional<Item> itemOptional = jpaItemRepository.findById(request.getId());
        return itemOptional.isEmpty()
                ? new DeleteItemResponse(true)
                :new DeleteItemResponse(false);
    }
}
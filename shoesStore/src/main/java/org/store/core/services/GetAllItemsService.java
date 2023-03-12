package org.store.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.store.core.database.jpa.JpaItemRepository;
import org.store.core.requests.GetAllItemsRequest;
import org.store.core.responses.GetAllItemsResponse;

@Component
public class GetAllItemsService {

    @Autowired
    private JpaItemRepository jpaItemRepository;

    public GetAllItemsResponse execute(GetAllItemsRequest request) {
        return new GetAllItemsResponse(jpaItemRepository.findAll());
    }
}
package org.store.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.store.core.database.jpa.JpaItemRepository;
import org.store.core.requests.UpdateItemRequest;
import org.store.core.responses.UpdateItemResponse;

import javax.transaction.Transactional;

@Transactional
@Component
public class UpdateItemService {

    @Autowired
    private JpaItemRepository jpaItemRepository;

    public UpdateItemResponse execute(UpdateItemRequest request) {
        jpaItemRepository.updateItemName(request.getId(), request.getName());
        return new UpdateItemResponse(true);
    }

    /*
       if (request != null) {
            if (request.getBrand() == null || request.getModel() == null || request.getPrice() == null) {
                jpaItemRepository.updateItemName(request.getId(), request.getName());
            }
            if (request.getName() == null && request.getBrand() == null && request.getPrice() == null) {
                jpaItemRepository.updateItemModel(request.getId(), request.getModel());
            }
            if (request.getModel() == null && request.getBrand() == null && request.getName() == null) {
                jpaItemRepository.updateItemPrice(request.getId(), request.getPrice());
            }
            return new UpdateItemResponse(true);
        }
        return new UpdateItemResponse(false);
    }
     */
}
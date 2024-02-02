package org.app.dealer.core.services;

import org.app.dealer.core.database.jpa.JpaFinalOrderRepository;
import org.app.dealer.core.requests.DeleteFinalOrderRequest;
import org.app.dealer.core.responses.DeleteFinalOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeleteFinalOrderService {

    @Autowired
    private JpaFinalOrderRepository repository;

    public DeleteFinalOrderResponse execute(DeleteFinalOrderRequest request) {
        repository.deleteById(request.getId());
        return new DeleteFinalOrderResponse();
    }
}
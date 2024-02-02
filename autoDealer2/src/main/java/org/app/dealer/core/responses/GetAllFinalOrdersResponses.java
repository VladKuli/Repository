package org.app.dealer.core.responses;

import lombok.Getter;
import org.app.dealer.core.domain.FinalOrder;

import java.util.List;

@Getter
public class GetAllFinalOrdersResponses {

    private List<FinalOrder> finalOrders;

    public GetAllFinalOrdersResponses(List<FinalOrder> finalOrders) {
        this.finalOrders = finalOrders;
    }
}
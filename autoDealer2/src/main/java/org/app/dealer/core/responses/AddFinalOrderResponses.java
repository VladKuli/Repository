package org.app.dealer.core.responses;

import org.app.dealer.core.domain.Car;
import org.app.dealer.core.domain.FinalOrder;

import java.util.List;

public class AddFinalOrderResponses extends CoreResponse{
    private FinalOrder finalOrder;

    public AddFinalOrderResponses(List<CoreError> errors) {
        super(errors);
    }

    public AddFinalOrderResponses(FinalOrder finalOrder) {
        this.finalOrder = finalOrder;
    }

    public FinalOrder getFinalOrder() {
        return finalOrder;
    }
}
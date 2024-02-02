package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.FinalOrder;

import java.util.List;

@Getter
@NoArgsConstructor
public class DeleteFinalOrderResponse extends CoreResponse {

    private FinalOrder deletedFinalOrder;

    public DeleteFinalOrderResponse(List<CoreError> errors) {
        super(errors);
    }

    public DeleteFinalOrderResponse(FinalOrder deletedFinalOrder) {
        this.deletedFinalOrder = deletedFinalOrder;
    }

}
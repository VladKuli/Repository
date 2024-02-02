package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.FinalOrder;

import java.util.List;

@Getter
@NoArgsConstructor
public class UpdateFinalOrderResponse extends CoreResponse {

    private FinalOrder updatedFinalOrder;

    public UpdateFinalOrderResponse(List<CoreError> errors) {
        super(errors);
    }

    public UpdateFinalOrderResponse(FinalOrder updatedFinalOrder) {
        this.updatedFinalOrder = updatedFinalOrder;
    }
}
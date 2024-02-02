package org.app.dealer.core.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.FinalOrder;

@Getter
@NoArgsConstructor
public class UpdateFinalOrderRequest {

    private Long id;
    private Integer newPrice;

    public UpdateFinalOrderRequest(Long id) {
        this.id = id;
    }
}
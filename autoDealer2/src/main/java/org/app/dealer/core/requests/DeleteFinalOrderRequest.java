package org.app.dealer.core.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.FinalOrder;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteFinalOrderRequest {

    private Long id;
}
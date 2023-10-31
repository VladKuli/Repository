package org.app.dealer.core.requests;

import lombok.*;
import org.app.dealer.core.domain.Car;

@Data
@NoArgsConstructor
public class AddFinalOrderRequest {

    private Car car;

    private Integer price;
}
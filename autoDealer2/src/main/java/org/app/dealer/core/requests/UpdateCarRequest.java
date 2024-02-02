package org.app.dealer.core.requests;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateCarRequest {

    private Long id;
    private String newModel;
    private Long newHorsePower;
    private boolean newStatusIsItPremiumCar;

    public UpdateCarRequest(Long id) {
        this.id = id;
    }
}
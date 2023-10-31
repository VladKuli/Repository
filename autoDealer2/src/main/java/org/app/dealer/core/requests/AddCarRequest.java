package org.app.dealer.core.requests;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.ModificationsInfo;



@Data
@NoArgsConstructor
public class AddCarRequest {

    private ModificationsInfo info;
    private String model;
    private Long horsepower;
    private boolean isItPremiumCar;

}
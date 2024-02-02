package org.app.dealer.core.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.app.dealer.core.domain.ModificationsInfo;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCarRequest {

    private ModificationsInfo info;
    private String model;
    private Long horsepower;
    private boolean isItPremiumCar;

}
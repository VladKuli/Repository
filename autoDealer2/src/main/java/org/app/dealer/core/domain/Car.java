package org.app.dealer.core.domain;

import lombok.*;


@Data
@NoArgsConstructor
public class Car {


    private Long id;
    private ModificationsInfo info;
    private String model;
    private Long horsePower;
    private boolean isItPremiumCar;

    public Car(ModificationsInfo info,
               String model,
               Long horsePower,
               boolean isItPremiumCar) {
        this.info = info;
        this.model = model;
        this.horsePower = horsePower;
        this.isItPremiumCar = isItPremiumCar;
    }

    private boolean tuningCheck(ModificationsInfo info) {
        return info.isHaveSportExterior() || info.isHaveSportExhaust() ||
                info.isHaveModifiedEngine() || info.isHaveTurboTune();
    }

    private boolean carStatusCheck() {
        return info.isItPremiumCar();
    }
}
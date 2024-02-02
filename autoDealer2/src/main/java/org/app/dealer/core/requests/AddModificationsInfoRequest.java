package org.app.dealer.core.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddModificationsInfoRequest {

    private boolean isHaveModifiedEngine;
    private boolean isHaveSportExhaust;
    private boolean isHaveTurboTune;
    private boolean isHaveSportExterior;
    private boolean isItPremiumCar;
}
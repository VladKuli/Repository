package org.app.dealer.core.domain;

import lombok.*;

@Data
@NoArgsConstructor
public class ModificationsInfo {

    private Long id;
    private boolean isHaveModifiedEngine;
    private boolean isHaveSportExhaust;
    private boolean isHaveTurboTune;
    private boolean isHaveSportExterior;
    private boolean isItPremiumCar;

    public ModificationsInfo(boolean haveModifiedEngine,
                             boolean haveSportExhaust,
                             boolean haveTurboTune,
                             boolean haveSportExterior,
                             boolean itPremiumCar) {
        this.isHaveModifiedEngine = haveModifiedEngine;
        this.isHaveSportExhaust = haveSportExhaust;
        this.isHaveTurboTune = haveTurboTune;
        this.isHaveSportExterior = haveSportExterior;
        this.isItPremiumCar = itPremiumCar;
    }
}
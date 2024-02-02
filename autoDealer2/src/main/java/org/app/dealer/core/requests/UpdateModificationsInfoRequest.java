package org.app.dealer.core.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateModificationsInfoRequest {

    private Long id;
    private boolean newIsHaveModified;
    private boolean newIsHaveSportExhaust;
    private boolean newIsHaveTurboTune;
    private boolean newIsHaveSportExterior;
    private boolean newIsItPremiumCar;

    public UpdateModificationsInfoRequest(Long id) {
        this.id = id;
    }
}
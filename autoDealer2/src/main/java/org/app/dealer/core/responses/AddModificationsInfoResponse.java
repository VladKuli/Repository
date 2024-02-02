package org.app.dealer.core.responses;

import org.app.dealer.core.domain.Car;
import org.app.dealer.core.domain.ModificationsInfo;

import java.util.List;

public class AddModificationsInfoResponse extends CoreResponse{
    private ModificationsInfo info;

    public AddModificationsInfoResponse(List<CoreError> errors) {
        super(errors);
    }

    public AddModificationsInfoResponse(ModificationsInfo info) {
        this.info = info;
    }

    public ModificationsInfo getModificationsInfo() {
        return info;
    }
}
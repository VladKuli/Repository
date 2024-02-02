package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.ModificationsInfo;

import java.util.List;

@Getter
@NoArgsConstructor
public class DeleteModificationsInfoResponse extends CoreResponse {

    private ModificationsInfo deletedModificationsInfo;

    public DeleteModificationsInfoResponse(List<CoreError> errors) {
        super(errors);
    }

    public DeleteModificationsInfoResponse(ModificationsInfo deletedModificationsInfo) {
        this.deletedModificationsInfo = deletedModificationsInfo;
    }
}
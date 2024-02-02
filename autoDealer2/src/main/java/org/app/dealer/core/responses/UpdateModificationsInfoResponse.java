package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.ModificationsInfo;

import java.util.List;

@Getter
@NoArgsConstructor
public class UpdateModificationsInfoResponse extends CoreResponse {

    private ModificationsInfo updatedModificationsInfo;

    public UpdateModificationsInfoResponse(List<CoreError> errors) {
        super(errors);
    }
}

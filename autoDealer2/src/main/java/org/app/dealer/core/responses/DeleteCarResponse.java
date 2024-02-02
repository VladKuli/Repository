package org.app.dealer.core.responses;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class DeleteCarResponse extends CoreResponse {

    private boolean isDeleted;

    public DeleteCarResponse(List<CoreError> errors) {
        super(errors);
    }

    public DeleteCarResponse(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
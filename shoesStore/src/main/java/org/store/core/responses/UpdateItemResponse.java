package org.store.core.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UpdateItemResponse extends CoreResponse {

    private boolean isUpdated;

    List<CoreError> errors;

    public UpdateItemResponse(List<CoreError> errors) {
        this.errors = errors;
    }

    public UpdateItemResponse(boolean isUpdated) {
        this.isUpdated = isUpdated;
    }

}
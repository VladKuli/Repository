package org.store.core.responses;

import java.util.List;

public class DeleteItemResponse extends CoreResponse {
    private boolean isDeleted;
    private List<CoreError> errors;

    public DeleteItemResponse(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public DeleteItemResponse(List<CoreError> errors) {
        super(errors);
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
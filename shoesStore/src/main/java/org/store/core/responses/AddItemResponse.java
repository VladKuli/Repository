package org.store.core.responses;

import java.util.List;

public class AddItemResponse extends CoreResponse {

    private boolean isCompleted;
    private List<CoreError> errors;

    public AddItemResponse(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public AddItemResponse(List<CoreError> errors) {
        super(errors);
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
package org.app.dealer.core.services.validators;

import org.app.dealer.core.requests.AddFinalOrderRequest;
import org.app.dealer.core.responses.CoreError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddFinalOrderValidator {

    @Autowired
    private List<CoreError> validate(AddFinalOrderRequest request) {
        List<CoreError> errorList = new ArrayList<>();
        return errorList;
    }
}
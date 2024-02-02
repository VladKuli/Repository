package org.app.dealer.core.services.validators;

import org.app.dealer.core.domain.Car;
import org.app.dealer.core.requests.AddCarRequest;
import org.app.dealer.core.requests.AddUserRequest;
import org.app.dealer.core.responses.CoreError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AddCarValidator {

    public List<CoreError> validate(AddCarRequest request) {
        List<CoreError> errorList = new ArrayList<>();
        validateInfo(request).ifPresent(errorList::add);
        validateModel(request).ifPresent(errorList::add);
        validateHorsePower(request).ifPresent(errorList::add);
        return errorList;
    }


    private Optional<CoreError> validateInfo(AddCarRequest request) {
        return request.getInfo() != null
                ? Optional.empty()
                : Optional.of(new CoreError("Info field can't be empty"));
    }

    private Optional<CoreError> validateModel(AddCarRequest request) {
        return !request.getModel().isBlank()
                ? Optional.empty()
                : Optional.of(new CoreError("Model field can't be empty"));
    }

    private Optional<CoreError> validateHorsePower(AddCarRequest request) {
        return request.getHorsepower() > 0
                ? Optional.empty()
                : Optional.of(new CoreError("HorsePower must be more than zero"));
    }

}
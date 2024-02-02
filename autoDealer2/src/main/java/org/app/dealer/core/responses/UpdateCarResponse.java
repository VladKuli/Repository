package org.app.dealer.core.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.app.dealer.core.domain.Car;

import java.util.List;

@Getter
@NoArgsConstructor
public class UpdateCarResponse extends CoreResponse {

    private Car updatedCar;

    public UpdateCarResponse(List<CoreError> errors) {
        super(errors);
    }

    public UpdateCarResponse(Car updatedCar) {
        this.updatedCar = updatedCar;
    }
}
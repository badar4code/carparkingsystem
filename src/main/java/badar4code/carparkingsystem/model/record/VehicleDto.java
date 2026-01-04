package badar4code.carparkingsystem.model.record;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public record VehicleDto(
        Long id,
        @NotBlank(message = "Plate number cant be empty")
        String plateNumber,
        @NotNull(message = "Vehicle type is not specified")
        VehicleTypeDto vehicleTypeDto
) implements Serializable {
}

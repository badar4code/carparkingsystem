package badar4code.carparkingsystem.model.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;


public record SpotDto(
        Long id,
        @NotBlank(message = "Spot number is required")
        String number,
        @NotBlank(message = "Floor level is required")
        String floorLevel,
        boolean isOccupied,
        @NotNull(message = "Spot type is required")
        SpotTypeDto spotType
) implements Serializable {
}

package badar4code.carparkingsystem.model.record;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public record VehicleTypeDto(
        Long id,
        @NotBlank(message = "Name in Arabic is required")
        String nameAr,
        @NotBlank(message = "Name in English is Required")
        String nameEn
) implements Serializable {
}

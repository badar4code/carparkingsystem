package badar4code.carparkingsystem.model.record;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public record SpotTypeDto(
        Long id,
        @NotBlank(message = "Name in Arabic is require")
        String NameAr,
        @NotBlank(message = "Name in English is Required")
        String NameEn
) implements Serializable {
}

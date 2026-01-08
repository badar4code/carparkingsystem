package badar4code.carparkingsystem.model.record;

import badar4code.carparkingsystem.constants.UnitType;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.math.BigDecimal;

public record RateDto(
        Long id,
        @NotBlank String rateName,
        BigDecimal unitPrice,
        UnitType unitType
) implements Serializable {
}

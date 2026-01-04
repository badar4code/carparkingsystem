package badar4code.carparkingsystem.model.record;

import badar4code.carparkingsystem.enums.PaymentType;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


public record PaymentDto(
        Long id,
        @NotNull
        PaymentType paymentType,
        BigDecimal amount,
        LocalDateTime transactionDate,
        String referenceNumber
) implements Serializable {
  }
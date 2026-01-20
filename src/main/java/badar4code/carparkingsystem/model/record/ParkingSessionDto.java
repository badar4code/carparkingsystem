package badar4code.carparkingsystem.model.record;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;


public record ParkingSessionDto(
                                VehicleDto plateNumber,
                                LocalDateTime entryTimeDate,
                                LocalDateTime exitTimeDate,
                                BigDecimal totalAmountDue,
                                Duration duration,
                                StatusDto status,
                                RateDto rate,
                                SpotDto spot
) implements Serializable {
}
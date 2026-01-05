package badar4code.carparkingsystem.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Vehicle plateNumber;
    private LocalDateTime entryTimeDate;
    private LocalDateTime exitTimeDate;
    private BigDecimal totalAmountDue;
    private Duration duration;
    @OneToOne(cascade = CascadeType.ALL)
    private Status status;
    @OneToOne(cascade = CascadeType.ALL)
    private Rate rate;
    @OneToOne(cascade = CascadeType.ALL)
    private Spot spot;
}

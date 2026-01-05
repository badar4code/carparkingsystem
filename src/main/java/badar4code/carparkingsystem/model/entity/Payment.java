package badar4code.carparkingsystem.model.entity;

import badar4code.carparkingsystem.enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentType paymentType;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private String referenceNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private ParkingSession parkingSession;
}

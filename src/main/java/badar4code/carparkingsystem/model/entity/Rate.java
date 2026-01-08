package badar4code.carparkingsystem.model.entity;

import badar4code.carparkingsystem.constants.UnitType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String rateName;
    private BigDecimal unitPrice;
    @Enumerated(EnumType.STRING)
    private UnitType unitType;
}

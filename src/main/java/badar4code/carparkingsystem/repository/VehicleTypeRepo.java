package badar4code.carparkingsystem.repository;

import badar4code.carparkingsystem.model.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepo extends JpaRepository<VehicleType, Long> {
}

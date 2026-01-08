package badar4code.carparkingsystem.repository;

import badar4code.carparkingsystem.model.entity.VehicleType;
import badar4code.carparkingsystem.model.record.VehicleTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepo extends JpaRepository<VehicleType, Long> {
    public boolean existsVehicleTypesByCode(String code);
}

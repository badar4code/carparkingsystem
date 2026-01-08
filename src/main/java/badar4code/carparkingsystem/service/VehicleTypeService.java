package badar4code.carparkingsystem.service;


import badar4code.carparkingsystem.helper.ApiResponse;
import badar4code.carparkingsystem.helper.GenericMapper;
import badar4code.carparkingsystem.model.entity.VehicleType;
import badar4code.carparkingsystem.model.record.VehicleTypeDto;
import badar4code.carparkingsystem.repository.VehicleTypeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleTypeService {

    private final VehicleTypeRepo vehicleTypeRepo;

    private final GenericMapper genericMapper;


    @Autowired
    public VehicleTypeService(VehicleTypeRepo vehicleTypeRepo,
                              GenericMapper genericMapper) {
        this.vehicleTypeRepo = vehicleTypeRepo;
        this.genericMapper = genericMapper;
    }

    public ApiResponse<VehicleTypeDto> findById(Long id) {
        VehicleType vehicleType = vehicleTypeRepo.findById(id).orElse(null);
        if (vehicleType != null) {
            VehicleTypeDto dto = genericMapper.map(vehicleType, VehicleTypeDto.class);
            return new ApiResponse<>("", "successful", dto);
        }
        return new ApiResponse<>("", "not found", null);
    }
}

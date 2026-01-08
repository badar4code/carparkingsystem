package badar4code.carparkingsystem.service;


import badar4code.carparkingsystem.controller.BaseController;
import badar4code.carparkingsystem.handler.ApiResponseHandler;
import badar4code.carparkingsystem.helper.ApiResponse;
import badar4code.carparkingsystem.helper.GenericMapper;
import badar4code.carparkingsystem.model.entity.VehicleType;
import badar4code.carparkingsystem.model.record.VehicleTypeDto;
import badar4code.carparkingsystem.repository.VehicleTypeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleTypeService extends BaseController {

    private final VehicleTypeRepo vehicleTypeRepo;

    private final GenericMapper genericMapper;

    private final ApiResponseHandler responseHandler;


    @Autowired
    public VehicleTypeService(VehicleTypeRepo vehicleTypeRepo,
                              GenericMapper genericMapper, ApiResponseHandler responseHandler) {
        this.vehicleTypeRepo = vehicleTypeRepo;
        this.genericMapper = genericMapper;
        this.responseHandler = responseHandler;
    }

    public ApiResponse<VehicleTypeDto> findById(Long id) {
        Optional<VehicleType> result = vehicleTypeRepo.findById(id);

        if (result.isPresent()) {
            return responseHandler.success(genericMapper.map(result.get(), VehicleTypeDto.class), "Found");
        } else {
            return responseHandler.notFound("Vehicle Type not found");
        }
    }

    public ApiResponse<VehicleTypeDto> save(VehicleTypeDto dto) {
        if (vehicleTypeRepo.existsVehicleTypesByCode(dto.code())) {
            return responseHandler.badRequest("Code already exists!");
        }
        VehicleType vehicleType = genericMapper.map(dto, VehicleType.class);
        vehicleTypeRepo.save(vehicleType);
        return responseHandler.success(genericMapper.map(vehicleType, VehicleTypeDto.class), "Saved");
    }
}

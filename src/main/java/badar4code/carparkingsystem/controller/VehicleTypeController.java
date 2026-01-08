package badar4code.carparkingsystem.controller;


import badar4code.carparkingsystem.helper.ApiResponse;
import badar4code.carparkingsystem.model.entity.VehicleType;
import badar4code.carparkingsystem.model.record.VehicleTypeDto;
import badar4code.carparkingsystem.repository.VehicleTypeRepo;
import badar4code.carparkingsystem.service.VehicleTypeService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vehicle-types")
public class VehicleTypeController{

    private final VehicleTypeService vehicleTypeService;

    @Autowired
    public VehicleTypeController(VehicleTypeService vehicleTypeService) {
        this.vehicleTypeService = vehicleTypeService;
    }

    @RequestMapping(value = "/get-by-id", method =  RequestMethod.GET)
    public ResponseEntity<?> getVehicleTypeById(Long id) {
        final ApiResponse<VehicleTypeDto> vehicleTypeDto = vehicleTypeService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(vehicleTypeDto);
    }
}

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
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vehicle-types")
public class VehicleTypeController extends BaseController{

    private final VehicleTypeService vehicleTypeService;

    @Autowired
    public VehicleTypeController(VehicleTypeService vehicleTypeService) {
        this.vehicleTypeService = vehicleTypeService;
    }

    @GetMapping("/get-by-id")
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return createResponse(vehicleTypeService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VehicleTypeDto dto) {
        return createResponse(vehicleTypeService.save(dto));
    }
}

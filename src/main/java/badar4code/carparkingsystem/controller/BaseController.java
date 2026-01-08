package badar4code.carparkingsystem.controller;

import badar4code.carparkingsystem.helper.ApiResponse;
import org.springframework.http.ResponseEntity;

public abstract class BaseController {

    protected ResponseEntity<?> createResponse(ApiResponse<?> response) {

        return ResponseEntity
                .status(response.getStatus()) // Uses the status inside the object (200, 404, 201)
                .body(response);
    }
}
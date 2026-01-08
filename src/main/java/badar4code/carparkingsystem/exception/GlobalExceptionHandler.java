package badar4code.carparkingsystem.exception;

import badar4code.carparkingsystem.handler.ApiResponseHandler;
import badar4code.carparkingsystem.helper.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final ApiResponseHandler responseHandler;

    public GlobalExceptionHandler(ApiResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> handleNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(responseHandler.failure("SEARCH", ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleGeneric(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(responseHandler.failure("GENERAL", "Unexpected error occurred"));
    }
}

package badar4code.carparkingsystem.handler;

import badar4code.carparkingsystem.helper.ApiResponse;
import org.springframework.stereotype.Component;


@Component
public class ApiResponseHandler {

    private static final String API_VERSION = "1.0";

    public <T> ApiResponse<T> success(T data, String operation, String message) {
        return new ApiResponse<>(API_VERSION, message, operation, data);
    }

    public <T> ApiResponse<T> failure(String operation, String message) {
        return new ApiResponse<>(API_VERSION, message, operation, null);
    }
}

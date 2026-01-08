package badar4code.carparkingsystem.handler;

import badar4code.carparkingsystem.helper.ApiResponse;
import org.springframework.stereotype.Component;


@Component
public class ApiResponseHandler {

    private static final String API_VERSION = "1.0";

    public <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(API_VERSION, message, data);
    }

    public <T> ApiResponse<T> failure(String message) {
        return new ApiResponse<>(API_VERSION, message, null);
    }
}

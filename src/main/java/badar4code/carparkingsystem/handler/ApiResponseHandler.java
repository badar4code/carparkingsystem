package badar4code.carparkingsystem.handler;

import badar4code.carparkingsystem.helper.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


@Component
public class ApiResponseHandler {
    public <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>( message, data, HttpStatus.OK );
    }

    public <T> ApiResponse<T> failure(String message) {
        return new ApiResponse<>(message, null,HttpStatus.INTERNAL_SERVER_ERROR);
    }


    public <T> ApiResponse<T> created(T data, String message) {
        return new ApiResponse<>(message, data, HttpStatus.CREATED);
    }

    public <T> ApiResponse<T> badRequest(String message) {
        return new ApiResponse<>(message, null, HttpStatus.BAD_REQUEST);
    }

    public <T> ApiResponse<T> notFound(String message) {
        return new ApiResponse<>(message, null, HttpStatus.NOT_FOUND);
    }
}

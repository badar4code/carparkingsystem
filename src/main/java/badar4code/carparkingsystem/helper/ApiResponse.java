package badar4code.carparkingsystem.helper;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ApiResponse<T> implements Serializable {

    private String version;
    private String message;
    private String operation;
    private T data;

    public ApiResponse() {}

    public ApiResponse(String version, String message, String operation, T data) {
        this.version = version;
        this.message = message;
        this.operation = operation;
        this.data = data;
    }

}

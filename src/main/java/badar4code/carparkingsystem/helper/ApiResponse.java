package badar4code.carparkingsystem.helper;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ApiResponse<T> implements Serializable {

    private String version;
    private String message;
    private T data;

    public ApiResponse() {}

    public ApiResponse(String version, String message, T data) {
        this.version = version;
        this.message = message;
        this.data = data;
    }

}

package badar4code.carparkingsystem.helper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Setter
@Getter
public class ApiResponse<T> implements Serializable {


    private String message;
    private T data;
    @JsonIgnore
    private HttpStatus status;

    public ApiResponse() {}

    public ApiResponse(String message, T data, HttpStatus status) {

        this.message = message;
        this.data = data;
        this.status = status;
    }

}

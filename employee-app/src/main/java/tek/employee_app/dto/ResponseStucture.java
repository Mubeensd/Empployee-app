package tek.employee_app.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseStucture <T>{
    private int statusCode;
    private String massage;
    private T data;
}

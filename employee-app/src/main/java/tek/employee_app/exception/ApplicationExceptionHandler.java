package tek.employee_app.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tek.employee_app.dto.ResponseStucture;

@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private ResponseStucture<String> responseStucture;

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ResponseStucture<String>> catchEmployeeNotFountException(EmployeeNotFoundException employeeNotFoundException){
      responseStucture.setMassage(" Employee Not found");
      responseStucture.setStatusCode(HttpStatus.NOT_FOUND.value());
      responseStucture.setData(employeeNotFoundException.getMessage());
      return new ResponseEntity<ResponseStucture<String>>(responseStucture,HttpStatus.NOT_FOUND);

    }
}

package tek.employee_app.exception;

public class EmployeeNotFoundException extends RuntimeException{

    String message=" employee not in db";

    public EmployeeNotFoundException(String message){
        this.message=message;

    }

    EmployeeNotFoundException(){


    }

    @Override
    public String getMessage() {
        return message;
    }
}

package tek.employee_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tek.employee_app.dao.EmployeeDao;
import tek.employee_app.dto.ResponseStucture;
import tek.employee_app.entites.Employee;
import tek.employee_app.exception.EmployeeNotFoundException;

import java.util.Objects;

@Service
public class EmployeeService {


    @Autowired
    private ResponseStucture<Employee> responseStucture;
    @Autowired
    private EmployeeDao employeeDao;

    public ResponseEntity<ResponseStucture<Employee>> saveEmployee(Employee employee) {
        Employee employee1 = employeeDao.saveEmployee(employee);
        responseStucture.setData(employee1);
        responseStucture.setMassage("Details save Successfully ");
        responseStucture.setStatusCode(HttpStatus.CREATED.value());

        return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatus.CREATED);
    }

    public ResponseEntity<ResponseStucture<Employee>> getEmployeeById(int eid) {

            Employee employee = employeeDao.getEmployee(eid);

            if (Objects.nonNull(employee)) {
                responseStucture.setStatusCode(HttpStatus.OK.value());
                responseStucture.setData(employee);
                responseStucture.setMassage(" Employee details found");
                return new ResponseEntity<ResponseStucture<Employee>>(responseStucture, HttpStatus.OK);
            } else {
                throw new EmployeeNotFoundException(" Employee Not Found by " + eid + " this ID");
            }



        }
    }




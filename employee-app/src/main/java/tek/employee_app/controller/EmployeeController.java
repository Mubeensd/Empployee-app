package tek.employee_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tek.employee_app.dto.ResponseStucture;
import tek.employee_app.entites.Employee;
import tek.employee_app.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<ResponseStucture<Employee>> saveEmployee(@RequestBody Employee employee) {
          return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{eid}")
    public ResponseEntity<ResponseStucture<Employee>> getEmployeeById(@PathVariable int eid){
        return employeeService.getEmployeeById(eid);


    }

}

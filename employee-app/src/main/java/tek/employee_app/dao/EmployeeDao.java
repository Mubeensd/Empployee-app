package tek.employee_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tek.employee_app.entites.Employee;
import tek.employee_app.repo.EmployeeRepository;

import java.util.List;
import java.util.Objects;
@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
      return   employeeRepository.save(employee);
    }

    public Employee getEmployee(int eid){
        return   employeeRepository.findById(eid).orElse(null);

    }

    public List<Employee> getAllEmployee(){
        return   employeeRepository.findAll();

    }

    public void deleteEmployeebById(int eid){
        Employee employee = employeeRepository.findById(eid).orElse(null);
        if(Objects.nonNull(employee)) {
            employeeRepository.delete(employee);
        }

    }

    public Employee updateEpmloyee(Employee employee){
        Employee employee1 = employeeRepository.findById(employee.getId()).orElse(null);
        if(Objects.nonNull(employee1)){
            return employeeRepository.save(employee);
        }
        return null;
    }
}

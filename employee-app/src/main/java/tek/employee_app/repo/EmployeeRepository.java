package tek.employee_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tek.employee_app.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

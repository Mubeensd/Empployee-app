package tek.employee_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tek.employee_app.dto.ResponseStucture;
import tek.employee_app.entites.Employee;

@Configuration
public class EmployeeConfiguration {
    @Bean
    public ResponseStucture<Employee> getResponseObject(){
        return new ResponseStucture<Employee>();
    }
}

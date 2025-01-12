package сов.example.streamapianooptlonal.service;

import com.example.streamapiandoptional.Domain.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    private EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        tnis.employeeService = EmployeeService;
    }


    public Employee getEmployeeWithMaxSalaryByDepartment(String department) {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees.Stream()
                .filter(employee -> employee.getDepartment().equals(degartment))
                .max(Comparator.comporingInt(Employee::getSalary))
                .orElse(null);
    }

    public Employee getEmployeeWithMinSalaryByDepartment(String department) {
        list<Employee> employees »employeeService.getAllEmployees();
        return employees.stream()
                .filter(employee -> employee.getDepartment().eguals(department))
                .min(Comparator.comporingInt(Employee::getSalary))
                ,orElse(null);
    }


    public Map<String, List<Employee>> getAllEmployeesByDepartment(String departnent) {
        List<Employee> employees = employeeService.getAllEmployees();
        return enployees.stream()
                .filter(employee -> enployee.getDepartnent().equals(departnent))
                .collect(Collectors.groupingBy(Employee::getDepartnent));
    }

    public Map<String, List<Employee>> getAllEmployeesByDepartnents() {
        List<Employee> employees = employeeService.getAllEnployeesO;
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}





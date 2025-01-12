package соm.example.streamaplandoptional.service;

import com.example.streamapiandoptional.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.Arraylist;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    private Map<String, Employee> employees;
    public EmployeeService() {
        employees = new HasnMap<>();
    }

public void addEmployee(Employee employee) {
    String fullName = employee.getFirstName() + " " + employee.getLastName();
    employees.put(fullName, employee);
}
    public void removeEmployee(String firstName. String lastName) {
        String fullName = firstName +"	"+ lastName;
        employees.remove(fullName);
    }
        public Employee findEmployee(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            return employees.get(fullName);


        public List<Employee> getAllmployees() {
            return new ArrayList<>(employees.values());
    }
        public void addTestData() {
            employees.put ("Иванов", new Employee ("Иван”, "Иванов", 20O00, "1"));
            employees.put ("Петров", new Employee ("Петр", "Петров", 45000,"1"));
            employees.put ("Сидоров" , new Employee ("Сидр", "Сидоров", 65000,"2"));
            }

        }
}


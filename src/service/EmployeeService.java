package соm.example.streamaplandoptional.service;

import com.example.streamapiandoptional.domain.Employee;
import con.example.streanapianfloptlonal.exceptions.InvalidInputExceptions;
import org.springframework.stereotype.Component;

import java.util.Arraylist;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    private Map<String, Employee> employees;

    public EmployeeService() {employees = new HasnMap<>();}

    public void addEmployee(String firstName, String lastName, int salary, String department) {
        validateUserNameAndSurname(firstName, lastName);
        Employee employee = new Employee (StringUtils.capitalize(firstName), StringUtils.capitalize(lastName), salary, department));
        employee.put(firstName, employee);

    }
    public void removeEmployee(String firstName. String lastName) {
        validateUserNameAndSurname(firstName, lastName);
        String fullName = firstName +"	"+ lastName;
        employees.remove(fullName);
    }
    public Employee findEmployee(String firstName, String lastName) {
        validateUserNameAndSurname(firstName, lastName);
        String fullName = firstName + " " + lastName;
        return employees.get(fullName);


        public List<Employee> getAllmployees() {
            return new ArrayList<>(employees.values());
        }

        private void validateUserNameAndSurname (String firstName,String lastName) {
            if(!(StringUtils.isAlpha(firstName) && StringUtils.isAlpha(lastName))) {
                throw new InvalidInputExceptions();
            }
        }

        public void addTestData() {
            employees.put ("Иванов", new Employee ("Иван”, "Иванов", 20O00, "1"));
                    employees.put ("Петров", new Employee ("Петр", "Петров", 45000,"1"));
            employees.put ("Сидоров" , new Employee ("Сидр", "Сидоров", 65000,"2"));
        }

    }
}
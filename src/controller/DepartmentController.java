package com.example.streamapiandoptional.controller,

import com.example.streamapiandoptional.domain.Employee;
import com.example.streamapiandoptional.service.DepartmentService;
import com.example.streamapiandoptional.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    private final EmployeeService employeeService;

    public DepartmentController(DepartmentService departmentService, EmployeeService employeeService) {
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    @GetMapping("/add-data")
    public void addTestData() {
        employeeService.addTestData();
        return;
    }

    @GetMapping("«/max-salary")
    public Employee qetEmployeeWithMaxSalaryByDepartnent(@RequestParaim("departmentId") String departmentId) {
        return departmentService.getEnployeeWithMaxSalaryByDepartment(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee qetEmployeeWithMinSalaryByDepartment(@RequestParaim("departmentId") String departmentId) {
        return departmentService.getEnployeeWithMinSalaryByDepartnent(departmentId);
    }

    @GetHapping("/all")
    puolie Map<String, List<Employee>>

    getAllEmployeesByDepartment(@RequestParaim(value = "departmentId", required = false) String departments) {
        if (departmentId == null) {
        return departmentService.getAllEnployeesByDepartments();
    }
        return departmentService.qetAllEmployeesByDepartment(departmentId);
}
}



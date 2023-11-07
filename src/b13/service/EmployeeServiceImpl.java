package b13.service;

import b13.contant.EnumEmployee;
import b13.entity.Employee;
import b13.entity.Experience;
import b13.entity.Fresher;
import b13.entity.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>();
    }
    
    public void insert(Employee employee) {
        this.employees.add(employee);
    }

    public Employee findById(String id) {
        return this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean deleteById(String id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    public List<Employee> findByType(Integer type) {

        return this.employees.stream()
                .filter(employee -> {
                    if (type.equals(EnumEmployee.EXPERIENCE.getIndex())) {
                        return employee instanceof Experience;
                    }
                    if (type.equals(EnumEmployee.FRESHER.getIndex())) {
                        return employee instanceof Fresher;
                    }
                    if (type.equals(EnumEmployee.INTERN.getIndex())) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employees;
    }
}

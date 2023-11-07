package b13.controller;

import b13.entity.Employee;
import b13.exception.FullNameException;
import b13.service.Validator;
import b13.view.EmployeeView;

import java.util.List;

public class EmployeeController {
    private List<Employee> employeeList;
    private EmployeeView view;

    public EmployeeController(List<Employee> employees, EmployeeView view) {
        this.employeeList = employees;
        this.view = view;
    }

    public void employeeValidate (Employee employee) throws FullNameException {
        Validator.fullNameCheck(employee.getFullName());
    }

    public void showEmployeeList() {
        view.showEmployeeList(employeeList);
    }

    public void insert (Employee employee) throws FullNameException {
        employeeValidate(employee);
        this.employeeList.add(employee);
    }

    public Employee findById(String id) {
        return this.employeeList.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean deleteById(String id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        }
        this.employeeList.remove(employee);
        return true;
    }

    public void run () {
        view.showMessage("EMS PROGRAMMING");
        view.showOption(employeeList);
        //view.addEmployee(0);
        view.showEmployeeList(employeeList);
    }

    public EmployeeView getView() {
        return view;
    }

    public void setView(EmployeeView view) {
        this.view = view;
    }
}

package b13.controller;

import b13.contant.EnumEmployee;
import b13.entity.Employee;
import b13.entity.Experience;
import b13.entity.Fresher;
import b13.entity.Intern;
import b13.exception.FullNameException;
import b13.service.Validator;
import b13.view.EmployeeView;
import b13.view.MenuValue;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Employee> findByType(int type) {
        return this.employeeList.stream()
                .filter(employee -> {
                    if (type == EnumEmployee.EXPERIENCE.getIndex()) {
                        return employee instanceof Experience;
                    }
                    if (type == EnumEmployee.FRESHER.getIndex()) {
                        return employee instanceof Fresher;
                    }
                    if (type == EnumEmployee.INTERN.getIndex()) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
    public boolean deleteById(String id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        }
        this.employeeList.remove(employee);
        return true;
    }

    public boolean update(String id, Employee updatedEmployee) throws FullNameException {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        } else {
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getId().equals(id)) {
                    employeeList.set(i, updatedEmployee);
                    return true;
                }
            }
        }
        return true;
    }

    public void run() throws FullNameException {
        while (true){
            int choice = view.menuOption();
            if (choice == MenuValue.DISPLAY_ALL.getValue()){
                view.showEmployeeList(employeeList);
            } else if (choice == MenuValue.DISPLAY_TYPE.getValue()) {
                int type = view.getType();
                List<Employee> list = findByType(type);
                view.showEmployeeList(list);
            } else if(choice == MenuValue.ADD.getValue()){
                Employee employee = view.addEmployee();
                insert(employee);
            } else if (choice == MenuValue.DELETE.getValue()) {
                String deleteId = view.getID();
                boolean deleteCheck = deleteById(deleteId);
                if (deleteCheck) {
                    view.successDelete();
                } else {
                    view.failDelete();
                }
            } else if (choice == MenuValue.UPDATE.getValue()) {
                String updateId = view.getID();
                Employee updatedEmployee = view.updateEmployee(updateId);
                boolean updateCheck = update(updateId, updatedEmployee);
                if (updateCheck) {
                    view.successUpdate();
                } else {
                    view.failUpdate();
                }
            } else {
                System.out.println("INVALID.");
            }
        }
    }
    public EmployeeView getView() {
        return view;
    }
    public void setView(EmployeeView view) {
        this.view = view;
    }
}

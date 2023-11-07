package b13;

import b13.controller.EmployeeController;
import b13.entity.Employee;
import b13.entity.Intern;
import b13.exception.FullNameException;
import b13.view.EmployeeView;
import b4.Family;
import b4.Person;
import b4.Town;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) throws FullNameException {
        int count = 0;
        EmployeeView view = new EmployeeView();
        List<Employee> employeeList = new ArrayList<>();
        EmployeeController controller = new EmployeeController(employeeList, view);

        Intern intern1 = new Intern("", "Nguyen Van A", "1/1/0000", "123456789", "abc@", null, "IT", "", "ABC");
        Intern intern2 = new Intern("", "Nguyen Van B", "1/1/0000", "123456789", "abc@", null, "IT", "", "ABC");

        controller.insert(intern1);
        controller.insert(intern2);

        controller.run();
    }
}

package b13.view;

import b13.contant.EnumEmployee;
import b13.entity.Employee;
import b13.entity.Experience;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    public static Scanner scanner = new Scanner(System.in);

    public void showMessage(String str) {
        System.out.println(str);
    }

    public void showEmployeeInfo (Employee employee) {
        showMessage(employee.toString());
    }

    public void showEmployeeList (List<Employee> employees) {
        employees.forEach(this::showEmployeeInfo);
    }

    public void showOption (List<Employee> employees){
        showMessage("Choose option: ");
        showMessage("0. Show Employee List. ");
        showMessage( "1. Add Employee. ");

        if (scanner.next().equals("0")) {
            showEmployeeList(employees);
        } else if (scanner.next().equals("1")){
            showMessage("Choose type: ");
            Employee employee = addEmployee(scanner.next());
            employees.add(employee);
        } else {
            showMessage("ERROR");
            return;
        }
    }

    public Employee addEmployee(String type) {
        Integer check = EnumEmployee.EXPERIENCE.getIndex();
        if (type.equals(EnumEmployee.EXPERIENCE.getIndex())) {
            Experience experience = new Experience();

            showMessage("Enter full name: ");
            experience.setFullName(scanner.next());

            showMessage("Enter birthday: ");
            experience.setBirthday(scanner.next());

            //showMessage("Enter experienced time: ");
            //experience.setExpInYear(scanner.next());

            showMessage("Enter skills: ");
            experience.setProSkill(scanner.next());

            return experience;
        } else {
            return null;
        }
    }
}

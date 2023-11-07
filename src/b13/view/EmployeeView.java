package b13.view;

import b13.contant.EnumEmployee;
import b13.entity.Employee;
import b13.entity.Experience;
import b13.entity.Fresher;
import b13.entity.Intern;

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

    public Employee receiveInfo () {
        Employee employee = new Employee() {
            @Override
            public void showInfo() {}
        };

        showMessage("Enter full name: ");
        employee.setFullName(scanner.next());

        showMessage("Enter birthday: ");
        employee.setBirthday(scanner.next());

        employee.setFullName("abc");

        return employee;
    }
    public void showOption (List<Employee> employees) {
        while (true) {
            showMessage("Choose option: ");
            showMessage("0. Show Employee List. ");
            showMessage("1. Add Employee. ");
            showMessage("2. Remove Employee. ");
            showMessage("3. Update Employee. ");
            showMessage("4. Find Employee. ");
            showMessage("5. Exit. ");

            Integer option = scanner.nextInt();
            switch (option) {
                case 0 :
                    showEmployeeList(employees);
                    break;
                case 1:
                    showMessage("Choose type: ");
                    Integer type = scanner.nextInt();
                    Employee employee = addEmployee(type);
                    employees.add(employee);
                    break;
                default:
                    break;
            }
        }
    }

    public Employee addEmployee(Integer type) {
        Integer check = EnumEmployee.EXPERIENCE.getIndex();

        showMessage("Enter full name: ");
        String name = scanner.next();

        showMessage("Enter birthday: ");
        String doB = scanner.next();


        if (type.equals(EnumEmployee.EXPERIENCE.getIndex())) {
            Experience experience = new Experience("", name, doB, "", "", null, 0, "");
            
            //showMessage("Enter experienced time: ");
            //experience.setExpInYear(scanner.next());

            showMessage("Enter skills: ");
            experience.setProSkill(scanner.next());

            return experience;
        } else if (type.equals(EnumEmployee.FRESHER.getIndex())){
            Fresher fresher = new Fresher("", name, doB, "", "", null, "", "", "");
            showMessage("Enter majors: ");
            fresher.setEducation(scanner.next());
            return fresher;
        } else if (type.equals(EnumEmployee.INTERN.getIndex())){
            Intern intern = new Intern("", name, doB, "", "", null, "", "", "");
            showMessage("Enter majors: ");
            intern.setMajors(scanner.next());
            return intern;
        } else {
            return null;
        }
    }
}

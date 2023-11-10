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
        int size =  employees.size();

        if (size == 0 ) {
            showMessage("No employees found.");
            return;
        }
        //showListView();
        employees.forEach(this::showEmployeeInfo);
    }

    public void showEmployeeListByType (List<Employee> employees) {
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
    public int menuOption() {
        showMessage("Choose option: ");
        showMessage("0. Show Employee List. ");
        showMessage("1. Show Employee List. ");
        showMessage("2. Add Employee. ");
        showMessage("3. Remove Employee. ");
        showMessage("4. Update Employee. ");
        showMessage("5. Find Employee. ");
        showMessage("6. Exit. ");

        int option = scanner.nextInt();
        return option;
    }

    public Employee updateEmployee(String id, Employee employee) {
        showMessage("Enter New Name: ");
        String newFullName = scanner.next();

        showMessage("Enter New DOB: ");
        String newBirthDay = scanner.next();

        showMessage("Enter New Phone Number: ");
        String newPhone = scanner.next();

        showMessage("Enter New Email: ");
        String newEmail = scanner.next();

        employee.setBirthday(newBirthDay);
        employee.setEmail(newEmail);
        employee.setPhone(newPhone);
        employee.setFullName(newFullName);

        if(employee instanceof Experience){
            showMessage("Enter new experience: ");
            int expInYear = scanner.nextInt();

            showMessage("Enter new skills: ");
            String proSkill = scanner.nextLine();

            ((Experience) employee).setProSkill(proSkill);
            ((Experience) employee).setExpInYear(expInYear);
        }
        else if (employee instanceof Fresher){
            showMessage("Enter new graduation: ");
            String graduationDate = scanner.nextLine();

            showMessage("Enter new rank: ");
            String graduationRank = scanner.nextLine();

            showMessage("Enter new education: ");
            String education = scanner.nextLine();

            ((Fresher) employee).setEducation(education);
            ((Fresher) employee).setGraduationDate(graduationDate);
            ((Fresher) employee).setGraduationRank(graduationRank);
        }
        else if (employee instanceof Intern) {
            showMessage("Enter new major: ");
            String majors = scanner.nextLine();

            showMessage("Enter new semester: ");
            String semester = scanner.nextLine();

            showMessage("Enter new university: ");
            String universityName = scanner.nextLine();

            ((Intern) employee).setMajors(majors);
            ((Intern) employee).setSemester(semester);
            ((Intern) employee).setUniversityName(universityName);
        }

        return employee;
    }

    public void successDelete() {
        showMessage("DELETE SUCCESSFULLY");
    }

    public void failDelete() {
        showMessage("DELETE FAIL");
    }

    public void successUpdate() {
        showMessage("UPDATE SUCCESSFULLY");
    }

    public void failUpdate() {
        showMessage("UPDATE FAIL");
    }


    public String getID() {
        showMessage("Enter Id: ");
        String id = scanner.next();
        //scanner.nextLine();
        return id;
    }

    public int getType() {
        showMessage("Enter type: ");
        int type = scanner.nextInt();
        //scanner.nextLine();
        return type;
    }
    public Employee addEmployee() {
        Integer check = EnumEmployee.EXPERIENCE.getIndex();

        showMessage("Enter full name: ");
        String name = scanner.next();

        showMessage("Enter birthday: ");
        String doB = scanner.next();

        showMessage("Enter phone number: ");
        String phone = scanner.next();

        showMessage("Enter email: ");
        String email = scanner.next();

        showMessage("Enter type: ");
        int type = scanner.nextInt();

        if (type == EnumEmployee.EXPERIENCE.getIndex()) {
            Experience experience = new Experience("", name, doB, phone, email, null, 0, "");

            showMessage("Enter experienced time: ");
            experience.setExpInYear(scanner.nextInt());

            showMessage("Enter skills: ");
            experience.setProSkill(scanner.next());

            return experience;

        } else if (type == EnumEmployee.FRESHER.getIndex()){
            Fresher fresher = new Fresher("", name, doB, phone, email, null, "", "", "");

            showMessage("Enter graduation date: ");
            fresher.setGraduationDate(scanner.next());

            showMessage("Enter graduation rank: ");
            fresher.setGraduationRank(scanner.next());

            showMessage("Enter majors: ");
            fresher.setEducation(scanner.next());

            return fresher;

        } else if (type == EnumEmployee.INTERN.getIndex()){
            Intern intern = new Intern("", name, doB, phone, email, null, "", "", "");

            showMessage("Enter majors: ");
            intern.setMajors(scanner.next());

            System.out.print("Emter semester: ");
            intern.setSemester(scanner.nextLine());

            System.out.print("Emter university name: ");
            intern.setUniversityName(scanner.nextLine());

            return intern;

        } else {
            return null;
        }
    }
}

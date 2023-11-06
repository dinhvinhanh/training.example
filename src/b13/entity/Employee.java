package b13.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    public static int employeeCount = 0;
    private String id;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private String employeeType;
    private List<Certificate> certificates;

    public Employee (){}

    public Employee(String id, String fullName, String birthDay, String phone, String emai, List<Certificate> certificates) {
        //employeeCount ++;
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }

    public void addCertificate(String id, String name, String rank, String date) {
        Certificate certificate = new Certificate(id, name, rank, date);
        certificates.add(certificate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", certificates=" + certificates +
                '}';
    }

    public abstract void showInfo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthDay;
    }

    public void setBirthday(String birthday) {
        this.birthDay = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
}

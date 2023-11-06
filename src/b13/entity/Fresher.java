package b13.entity;

import java.util.List;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher (){}

    public Fresher(String id, String fullName, String birthDay, String phone, String email, List<Certificate> certificates, String graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                super.toString() +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                "} ";
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}

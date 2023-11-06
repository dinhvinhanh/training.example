package b13.entity;

import java.util.List;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience (){}

    public Experience(String id, String fullName, String birthDay, String phone, String email, List<Certificate> certificates, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                super.toString() +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                "} ";
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}

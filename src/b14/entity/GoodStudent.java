package b14.entity;
public class GoodStudent extends Student {
    double gpa;
    String bestRewardName;
    public GoodStudent(String fullName, String dob, String gender, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, dob, gender, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "GoodStudent{" +
                super.toString() +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                "} ";
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
}

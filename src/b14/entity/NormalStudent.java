package b14.entity;
public class NormalStudent extends Student {
    double englishScore;
    double entryTestScore;

    public NormalStudent(String fullName, String dob, String gender, String phoneNumber, String universityName, String gradeLevel, double englishScore, double entryTestScore) {
        super(fullName, dob, gender, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                super.toString() +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                "} ";
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }
}



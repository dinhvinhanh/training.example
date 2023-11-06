package b13.entity;

public class Certificate {
    private String certId;
    private String certName;
    private String certRank;
    private String certDate;

    public Certificate (){}

    public Certificate(String certId, String certName, String certRank, String certDate) {
        this.certId = certId;
        this.certName = certName;
        this.certRank = certRank;
        this.certDate = certDate;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertRank() {
        return certRank;
    }

    public void setCertRank(String certRank) {
        this.certRank = certRank;
    }

    public String getCertDate() {
        return certDate;
    }

    public void setCertDate(String certDate) {
        this.certDate = certDate;
    }
}

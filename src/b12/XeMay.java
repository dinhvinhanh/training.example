package b12;

public class XeMay extends PTGT {
    private double congSuat;

    public XeMay(){}

    public XeMay(String hangSX, int namSX, double gia, String mau, double congSuat, String maSo) {
        super(hangSX, namSX, gia, mau, maSo);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString() +
                "congSuat=" + congSuat +
                "} ";
    }
}

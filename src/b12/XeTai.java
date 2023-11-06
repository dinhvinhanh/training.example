package b12;

public class XeTai extends PTGT {
    private double trongTai;

    public XeTai(){}

    public XeTai(String hangSX,int namSX,double gia,String mau,double trongTai,String maSo)
    {
        super(hangSX,namSX,gia,mau, maSo);
        this.trongTai=trongTai;
    }

    public void setTrongTai(double trongTai)
    {
        this.trongTai=trongTai;
    }

    public double getTrongTai()
    {
        return this.trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString() +
                "trongTai=" + trongTai +
                "} ";
    }
}

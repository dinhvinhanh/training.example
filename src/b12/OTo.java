package b12;

public class OTo extends PTGT {
    private int soCho;

    private String kieuDongCo;

    public OTo (){}

    public OTo(String hangSX, int namSX, double gia, String mau, int soCho, String kieuDongCo, String maSo) {
        super(hangSX, namSX, gia, mau, maSo);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return "OTo{" +
                super.toString() +
                "soCho=" + soCho +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                "} ";
    }
}

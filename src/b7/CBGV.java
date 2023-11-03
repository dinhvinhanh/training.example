package b7;

import java.util.ArrayList;
import java.util.List;

public class CBGV extends Nguoi{
    private double luongCung;
    private double luongThuong;
    private double tienPhat;

    public CBGV(String hoTen, int tuoi, String queQuan, String maSoGV) {
        super(hoTen, tuoi, queQuan, maSoGV);
    }

    public CBGV(String hoTen, int tuoi, String queQuan, String maSoGV, double luongCung, double luongThuong, double tienPhat) {
        super(hoTen, tuoi, queQuan, maSoGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public String toString() {
        return "CBGV{" +
                "luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                '}';
    }
}

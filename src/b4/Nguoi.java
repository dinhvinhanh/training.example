package b4;

import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String nNghiep;

    public Nguoi() {

    }

    public Nguoi(String hoTen, Date ngaySinh, String nNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nNghiep = nNghiep;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        int ngay, thang, nam;
        System.out.print("Nhap ho va ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang sinh: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        nam = sc.nextInt();
        this.ngaySinh = new Date(nam, thang, ngay);
        sc.nextLine();
        System.out.println("Nhap nghe nghiep: ");
        this.nNghiep = sc.nextLine();
    }

    public void inThongTin() {
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh.getDate() + "/" + this.ngaySinh.getMonth() + "/" + this.ngaySinh.getYear());
        System.out.println("Nghe nghiep: " + this.nNghiep);
    }

    public int getYear() {
        return this.ngaySinh.getYear();
    }
}

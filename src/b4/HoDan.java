package b4;

import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soThanhVien;
    private int soNha;
    private Nguoi thanhVien[] = new Nguoi[10];// bat buoc phai khoi tao

    public HoDan() {

    }

    public HoDan(int soThanhVien, int soNha, Nguoi thanhVien[]) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.thanhVien = thanhVien;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thanh vien trong gia dinh: ");
        this.soThanhVien = sc.nextInt();
        System.out.print("Nhap so nha: ");
        this.soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin ve tung thanh vien:");
        for (int i = 0; i < this.soThanhVien; i++) {
            System.out.println("Nhap thanh vien thu " + (i + 1) + " :");
            this.thanhVien[i] = new Nguoi();
            this.thanhVien[i].nhapThongTin();
        }
    }

    public void inThongTin() {
        System.out.println("So thanh vien: " + this.soThanhVien);
        System.out.println("So nha: " + this.soNha);
        System.out.println("Cac thanh vien trong gia dinh: ");
        try {
            for (int i = 0; i < this.soThanhVien; i++) {
                this.thanhVien[i].inThongTin();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println();
        }
    }

    public boolean mungTho(int nam) {
        for (int i = 0; i < this.soThanhVien; i++) {
            int a = this.thanhVien[i].getYear();
            if (a - nam > 80)
                return true;
        }
        return false;
    }
}

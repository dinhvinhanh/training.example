package b7;

import java.util.ArrayList;
import java.util.List;

public class CBGV_QL {
    private List<CBGV> danhSachCBGV;

    public CBGV_QL() {
        this.danhSachCBGV = new ArrayList<>();
    }

    public void themCBGV(CBGV cbgv) {
        danhSachCBGV.add(cbgv);
    }

    public boolean xoaCBGV(String maSoGV) {
        CBGV cbgv = this.danhSachCBGV.stream().filter(t -> t.getMaSoGV().equals(maSoGV)).findFirst().orElse(null);
        if (cbgv == null) {
            //log
            return false;
        }
        this.danhSachCBGV.remove(cbgv);
        return true;
    }

    public double xemLuong(String maSoGV) {
        CBGV cbgv = this.danhSachCBGV.stream().filter(t -> t.getMaSoGV().equals(maSoGV)).findFirst().orElse(null);
        if (cbgv == null) {
            //log
            return 0;
        }
        return cbgv.getLuongCung() + cbgv.getLuongThuong() + cbgv.getTienPhat();
    }

}

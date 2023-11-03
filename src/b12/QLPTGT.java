package b12;

import b7.CBGV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLPTGT {
    private List<PTGT> ds = new ArrayList();

    public void themPT (PTGT ptgt) {
        ds.add(ptgt);
    }

    public boolean xoaPT (String maSo) {
        PTGT ptgt = this.ds.stream().filter(t -> t.getMaSoPT().equals(maSo)).findFirst().orElse(null);
        if (ptgt == null) {
            //log
            return false;
        }
        this.ds.remove(ptgt);
        return true;
    }

    public List<PTGT> timKiem (String hangSX, String mau) {
        return ds.stream()
                .filter(ptgt -> ptgt.getHangSX().equalsIgnoreCase(hangSX) && ptgt.getMau().equalsIgnoreCase(mau))
                .toList();
    }

    public void inDS (List<PTGT> ds) {
        for (PTGT ptgt : ds) {
            if (ptgt instanceof OTo) {
                OTo oto = (OTo) ptgt;
                System.out.println(oto.toString());
            } else if (ptgt instanceof XeMay) {
                XeMay xeMay = (XeMay) ptgt;
                System.out.println(xeMay.toString());
            } else if (ptgt instanceof XeTai) {
                XeTai xeTai = (XeTai) ptgt;
                System.out.println(xeTai.toString());
            }
        }
    }
}

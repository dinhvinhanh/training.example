package b10;

public class VanBan {
    protected String str;
    VanBan(){}
    VanBan(String str) {
        this.str = str;
    }
    static int dem(VanBan vb)
    {
        int soDem;
        vb.str = ChuanHoa(vb);
        if (vb.str.charAt(0)==' ') soDem=0;
        else soDem=1;
        for (int i=0; i<vb.str.length(); i++) {
            if (vb.str.charAt(i) == ' ' && vb.str.charAt(i + 1) != ' ') soDem++;
        }
        return soDem;
    }
    static int demkt(VanBan vb)
    {
        int soDem = 0;
        for (int i=0; i<vb.str.length(); i++) {
            if (vb.str.charAt(i) == 'A' || vb.str.charAt(i) == 'a') ;
            soDem++;
        }
        return soDem;
    }
    static String ChuanHoa(VanBan vb)
    {
        StringBuffer noiDung = new StringBuffer (vb.str);

        while(noiDung.charAt(0) == ' ') {
            noiDung = noiDung.delete(0, 1);
        }

        while(noiDung.charAt(noiDung.length()-1) == ' ') {
            noiDung = noiDung.delete(noiDung.length()-1, noiDung.length());
        }

        for (int i=1; i<noiDung.length(); i++) {
            while (noiDung.charAt(i) == ' ' && noiDung.charAt(i+1) == ' ')
                noiDung = noiDung.delete(i,i+1);
        }

        return(noiDung.toString());
    }
}

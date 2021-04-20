package buoi8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  public class TamGiac{
    private testTamGiac A = new testTamGiac();
    private testTamGiac B = new testTamGiac();
    private testTamGiac C = new testTamGiac();
    double AB, BC, AC;
    TamGiac() {}
    TamGiac(testTamGiac d1, testTamGiac d2, testTamGiac d3) {
        A = d1;
        B = d2;
        C = d3;
    }

    double Chuvi() {
        double cv = 0;
        cv = AB + BC + AC;
        return cv;
    }

    double Dientich() {
        double dt;
        float p;
        p = (float) (AB + BC + AC) / 2;
        dt = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
        return dt;
    }

    static String nhapgt() throws IOException {
        String str;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        str = br.readLine();
        return str;
    }
    static testTamGiac nhapdiem(String x) throws IOException{
        int a,b;
        System.out.println("Diem"+x);
        System.out.println("hoanh do: ");
        a = Integer.valueOf(nhapgt()).intValue();
        System.out.println("Tung do: ");
        b= Integer.valueOf(nhapgt()).intValue();
        testTamGiac nd = new testTamGiac(a,b);
        return nd;
    }
    static buoi8.TamGiac nhaptgiac() throws IOException{
        testTamGiac d1 = new testTamGiac();
        testTamGiac d2 = new testTamGiac();
        testTamGiac d3 = new testTamGiac();
        d1 = nhapdiem("A");
        d2 = nhapdiem("B");
        d3 = nhapdiem("C");
        buoi8.TamGiac tg = new buoi8.TamGiac(d1,d2,d3);
        tg.AB = d1.tinhkc(tg.A, tg.B);
        tg.AC = d1.tinhkc(tg.A, tg.C);
        tg.BC = d1.tinhkc(tg.B, tg.C);
        return tg;
    }

    public static void main(String args[]) throws IOException {
        buoi8.TamGiac TG = new buoi8.TamGiac();
        TG = nhaptgiac();
        System.out.println("Chu vi:"+ TG.Chuvi());
        System.out.println("Dien tich: "+ TG.Dientich());

    }
}



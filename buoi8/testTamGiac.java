package buoi8;

public class testTamGiac {
    protected double hd,td;
    testTamGiac(){}
    testTamGiac(double a, double b){
        hd = a;
        td = b;
    }
    void in(){
        System.out.println("("+ hd+","+td+")");
    }
    double tinhkc(testTamGiac d1,testTamGiac d2){
        double kc = 0;
        kc = Math.sqrt(Math.pow(d1.hd-d2.hd,2)+Math.pow(d1.td - d2.td,2));
        return kc;
    }
}

package buoi2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        List<String> phim = new ArrayList<>();
        phim.add("1.batman");
        phim.add("2.bo gia");
        phim.add("3.the omen");
        phim.add("4.one piece");
        phim.add("5.winner is king");

        //in ra man hinh
        System.out.println("danh sách phim có sẵn: ");
        Iterator<String> in = phim.iterator();
        while (in.hasNext()){
            String s = in.next();
            System.out.println(s);
        }


        do {
            System.out.println("\nDanh sách tác vụ: ");
            System.out.println("-------------------------------");
            System.out.println("1.Thêm phim mới. ");
            System.out.println("2.Chỉnh sửa tên phim. ");
            System.out.println("3.Xóa phim. ");
            System.out.println("4.Tìm kiếm phim. ");
            System.out.println("5.In ra danh sách tất cả các phim. ");
            System.out.println("6.kêt thúc! ");
            System.out.println("-------------------------------");
            System.out.println("Mời bạn chọn: ");
            i = scan.nextInt();

            switch (i){
                case 1:
                    Scanner sc = new Scanner(System.in); //Tạo đối tượng Scanner
                    System.out.println("Mời bạn nhập tên phim: ");
                    String c = sc.nextLine();
                    phim.add(c);
                    System.out.println("Phim "+ c +" đã được thêm vào vị trí số: "+phim.indexOf(c));
                    break;

                case 2:
                    Scanner scn = new Scanner(System.in); //
                    System.out.println("Mời bạn chọn vị trí muốn sửa: ");
                    int v = scan.nextInt();
                    System.out.println("Nhập tên phim mới: ");
                    String n = scn.nextLine();
                    phim.set(v,n);
                    System.out.println("Phim đã được sửa thành: ");
                    System.out.println(v + "." + phim.get(v));
                    System.out.println("danh sách phim sau khi sửa là:");
                    System.out.println(phim);
                    break;

                case 3:
                    System.out.println("Nhập vị trí muốn xóa:");
                    int x = scan.nextInt();
                    phim.remove(x);
                    System.out.println("Phim đã được xóa. ");
                    System.out.println("danh sách sau khi xóa là: " );
                    System.out.println(phim);
                    break;

                case 4:
//                    String ccc = in.next();
                    Scanner scen = new Scanner(System.in);
                    System.out.println("Nhập tên bạn muốn tìm :");
                    String t = scen.nextLine();
//                    if (ccc == "1.batman"){
//                    System.out.println("Tìm thấy phim "+ t +"ở vị trí: "+phim.indexOf(ccc));
//                    return;
//                    } else if (ccc == "2.bo gia"){
//                        System.out.println("Tìm thấy phim "+ t +"ở vị trí: "+phim.indexOf(ccc));
//                        return;
//                    }else if (ccc == "3.the omen"){
//                        System.out.println("Tìm thấy phim "+ t +"ở vị trí: "+phim.indexOf(ccc));
//                        return;
//                    }
//                    else if (ccc == "4.one piece"){
//                        System.out.println("Tìm thấy phim "+ t +"ở vị trí: "+phim.indexOf(ccc));
//                        return;
//                    }
//                    else if (ccc == "5.winner is king"){
//                        System.out.println("Tìm thấy phim "+ t +"ở vị trí: "+phim.indexOf(ccc));
//                        return;
//                    }
//                    else {
//                        System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
//                    }
                    System.out.println("Tìm thấy phim "+ t +" ở vị trí: "+phim.indexOf(t));
                    break;
                case 5:
                        Iterator<String> ina = phim.iterator();
                        while (ina.hasNext()){
                            String s = ina.next();
                            System.out.println(s);
                        }
                        break;
            }
        }
        while (i<6);
            System.out.println("hẹn gặp bạn lần sau !");
        };
    }




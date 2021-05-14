package buoi5;

import java.sql.*;
import java.util.Scanner;

public class baiTest {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try(
                Connection drink = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafenew ","root","");

                Statement stmt = drink.createStatement();
                PreparedStatement pstmt = drink.prepareStatement(
                        "insert into books values (?, ?, ?, ?, ?)");

                PreparedStatement pstmtSelect = drink.prepareStatement("select * from Drink");

                ){
            drink.setAutoCommit(false);

            int a=0;
            do {
                System.out.println("===================");
                System.out.println("1.Hiển thị menu! ");
                System.out.println("2.Thêm vào danh sách yêu thích ! ");
                System.out.println("3.Hiển thị danh sách yêu thích ");
                System.out.println("4.Update lại danh sách yêu thích:");
                System.out.println("5.Xóa đồ uống yêu thích");
                System.out.println("6.Kết thúc.");
                System.out.println("====================");
                System.out.println("Mời bạn chọn :");
                a = scan.nextInt();
                switch (a){
                    case 1:
                        ResultSet rset = stmt.executeQuery(" select * from Drink ");

                        ResultSetMetaData rsetMD = (ResultSetMetaData) rset.getMetaData();
                        int numColumns = rsetMD.getColumnCount();


                        for (int i = 1; i <= numColumns; ++i) {
                            System.out.printf("%-30s",rsetMD.getColumnName(i));
                        }
                        System.out.println();

                        for (int i = 1; i <= numColumns; ++i) {
                            System.out.printf("%-30s",
                                    "(" +rsetMD.getColumnClassName(i) + ")");
                        }
                        System.out.println();

                        while (rset.next()) {
                            for (int i = 1; i <= numColumns; ++i) {

                                System.out.printf("%-30s",rset.getString(i));
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        System.out.println("Nhập tên đồ uống mà bạn yêu thích :");
                        String ten= scan.next();
                        System.out.println("Đồ uống yêu thích của bạn: "+ten );
                        


















                        break;

                    case 3:
                        String name = "tien";
//                        name.forEach(names->{
//                            System.out.println(names);
//                        });
                        break;

                    case 4:
                        System.out.println("Nhập vị trí tên phim bạn muốn thay đổi:");
                        int tr=scan.nextInt();
                        System.out.println("Nhập tên phim mới:");
                        String new_Movie= scan.next();
//                        name.set(tr,new_Movie);
//                        System.out.println("Tên phim mới được thay đổi là "+new_Movie);
//                        System.out.println(name);
                        break;

                    case 5:
                        System.out.println("Nhập vị trí tên phim bạn muốn xóa:");
                        int re_mv=scan.nextInt();
//                        name.remove(re_mv);
//                        System.out.println("Tên phim đã được xóa.");
//                        System.out.println(name);
                        break;


                }

            }while (a==6);
            System.out.println("Kết thúc!!");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

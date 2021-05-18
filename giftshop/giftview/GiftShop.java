package giftshop.giftview;

import java.sql.*;
import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            Scanner scanner = new Scanner(System.in);
            int y=0;
            do {
                System.out.println("list:");
                System.out.println("1. Hien thi sach.");
                System.out.println("2. nhap them sach moi.");
                System.out.println("3. xoa sach khong thich.");
                System.out.println("4. exit.");
                y= Integer.parseInt(scanner.nextLine());
                switch (y) {
                    case 1:
                        String strSelect = "select * from books";
                        System.out.println("The SQL statement is: " + strSelect + "\n");

                        ResultSet rset = stmt.executeQuery(strSelect);
                        while(rset.next()) {
                            System.out.println(rset.getInt("id") + ", "
                                    + rset.getString("name") + ", "
                                    + rset.getDouble("price") + ", "
                                    + rset.getInt("qty"));
                        }
                        break;
                    case 2:
                        System.out.println("Thêm sách mới: ");
                        System.out.println("nhập ID: ");
                        int id2 = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập name:");
                        String title = scanner.nextLine();
                        System.out.println("Nhập price:");
                        String price = scanner.nextLine();
                        System.out.println("Nhập qty:");
                        String qty = scanner.nextLine();String insert1= "insert into books values(?,?,?,?)";
                        PreparedStatement pstmt = conn.prepareStatement(insert1);
                        pstmt.setInt(1,id2);
                        pstmt.setString(2,title);
                        pstmt.setString(3, price);
                        pstmt.setString(4, qty );
                        int rowsInserted = pstmt.executeUpdate();
                        System.out.println(rowsInserted + " sách đã dược thêm mới!");
                        break;

                    case 3:
                        System.out.println("nhập id mà bạn muốn delete:");
                        String id1 = scanner.nextLine() ;
                        String sqlDeleteTwo ="delete from books where id = "+id1;
                        System.out.println("The SQL statement is: " + sqlDeleteTwo + "\n");

                        int countDeletedTwo = stmt.executeUpdate(sqlDeleteTwo);
                        System.out.println(countDeletedTwo + " records deleted.\n");
                        break;
                }
            }while (y<4);
            System.out.println("thank you!");
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

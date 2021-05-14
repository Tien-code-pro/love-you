package buoi5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            conn.setAutoCommit(false);


            stmt.addBatch("insert into books values(80096,'Tien pro','sach day tieng anh',1000,9.0)");
            stmt.addBatch("insert into books values(80066,'Tien pro','sach day hoa',1000,9.9)");
            stmt.addBatch("update books set price = 11.11 where id = 80098 or id = 80068");
            int[] returnCodes = stmt.executeBatch();
            System.out.println("Return code are: ");
            for (int code : returnCodes){
                System.out.println(code + " , ");

            }
            System.out.println(stmt);
            conn.commit();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

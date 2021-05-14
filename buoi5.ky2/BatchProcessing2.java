package buoi5;

import java.sql.*;

public class BatchProcessing2 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                Statement stmt = conn.createStatement();
                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into books values (?, ?, ?, ?, ?)");
        ) {


            conn.setAutoCommit(false);

            pstmt.setInt(1, 8010);
            pstmt.setString(2, "Java 123");
            pstmt.setString(3, "Kevin Jones");
            pstmt.setDouble(4, 12.34);
            pstmt.setInt(5, 88);
            pstmt.addBatch();


            pstmt.setInt(1, 8011);

            pstmt.setString(2, "Java 456");
            pstmt.addBatch();
            int[] returnCodes = pstmt.executeBatch();

            System.out.print("Return codes are: ");
            for (int code : returnCodes) System.out.printf(code + ", ");
            System.out.println(pstmt);

            conn.commit();

        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

package buoi5;

import java.sql.*;

public class ResultSetMetaDataTest {
    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                Statement stmt = conn.createStatement();
        ) {

            ResultSet rset = stmt.executeQuery(" select * from books ");

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
            }
        }
    }
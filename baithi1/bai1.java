package baithi;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int choose =0 ;
        List<Student> list = new ArrayList<>();
        do{
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save");
            System.out.println("4. Exit");
            System.out.print("Choose : ");
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){

                case 1 ->{
                    Student s = new Student();
                    s.input();
                    list.add(s);
                }
                case 2 ->{
                    list.forEach(System.out::println);
                }
                case 3 ->{
                    try (
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student ","root","");
                            Statement stmt = conn.createStatement();
                    ) {
                        String strSelect = "select * from studentone";
                        System.out.println("The SQL statement is: " + strSelect + "\n");

                        ResultSet rset = stmt.executeQuery(strSelect);
                        while(rset.next()) {
                            System.out.println(rset.getInt("id") + ", "
                                    + rset.getString("author") + ", "
                                    + rset.getString("title") + ", "
                                    + rset.getDouble("price") + ", "
                                    + rset.getInt("qty"));
                        }

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }


                }
                default ->{}
            }
        } while(choose !=4);
    }

}
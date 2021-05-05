package Java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class classes {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();

        student.add("luong minh tien ");
        student.add("luong minh thanh ");
        student.add("bui van hoa ");
        student.add("vu viet anh ");
        student.add("le dinh cuong ");
        student.add("bui huu thanh ");
        student.add("nguyen hoang anh ");


        System.out.println("danh sach hoc sinh cua lop: "+student);
        student.set(5,"thanh oc cho");
        System.out.println("danh sach hoc sinh sau khi doi ten: "+ student);

        student.remove(5);
        System.out.println("danh sách học sinh khi khong còn trong lớp: "+student);

        System.out.println("danh sách học sinh của lớp :");
        student.forEach( s -> {
            System.out.println(s);
        });

        System.out.println("\n danh sách hoc sinh của lớp");

        Iterator<String>studentIterator = student.iterator();

        while (studentIterator.hasNext()){
            String s = studentIterator.next();
            System.out.println(s);
        }

        System.out.println("\n danh sách hoc sinh của lớp");
        ListIterator<String>studentListIterator = student.listIterator(student.size());
        while (studentListIterator.hasPrevious()){
            String s = studentListIterator.previous();
            System.out.println(s);
        }

        System.out.println("\n danh sách hoc sinh của lớp");
        for (String s : student){
            System.out.println(s);
        }
        System.out.println("\n danh sách hoc sinh của lớp");
        for (int i = 0; i < student.size();i++){
            System.out.println(student.get(i));
        }

    }
}

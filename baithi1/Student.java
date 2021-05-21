package baithi;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String name;
    private String address;
    private int phone;

    public Student() {

    }

    public Student(String studentId, String name, String address, int phone) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Id : ");
        studentId = sc.nextLine();
        System.out.print("Input name : ");
        name = sc.nextLine();
        System.out.print("Input address : ");
        address = sc.nextLine();
        System.out.print("Input phone : ");
        phone = Integer.parseInt(sc.nextLine());
    }
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

}

package btvn6;

public class PartTimeEmployee extends Employee{
    private String shift;

    public PartTimeEmployee(String empId, String empName, int salary, String shift) {
        super(empId, empName, salary);
        this.shift = shift;
    }
    @Override
    public void displayDetails(){
        calcCommission(12); // Invoke the inherited method
        super.displayDetails(); // Invoke the super class display method
        System.out.println("Working shift:"+shift);
    }
}

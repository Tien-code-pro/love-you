package btvn6;

public class Employee {
    private String empId;
    private String empName;
    private int salary;
    private float commission;

    public Employee(String empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    public void calcCommission(float sales){
        if(sales > 10000)
            commission = salary * 20 / 100;
        else
            commission=0;
    }
    public void calcCommission(int overtime){
        if(overtime > 8)
            commission = salary/30;
        else
            commission = 0;
    }
    public void displayDetails(){
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Salary:"+salary);
        System.out.println("Commission:"+commission);
    }
}
package techademy;

import java.util.Scanner;

public class Employee {
    static Scanner in2 = new Scanner(System.in);
    private int empNo;
    private String empName;
    private String empAddress;
    private double empSalary;
    private String empDesignation;
    private String empDepartment;
    public Employee(){
        empNo = 0;
        empName = "";
        empAddress = "";
        empSalary = 0;
        empDesignation = "";
        empDepartment = "";
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    void display(){
        System.out.println("\nEmployee No: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Address: " + empAddress);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println("Employee Department: " + empDepartment);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Employee emp = new Employee();
        System.out.print("Enter Employee No: ");
        emp.setEmpNo(in2.nextInt());
        System.out.print("Enter Employee Name: ");
        emp.setEmpName(in.nextLine());
        System.out.print("Enter Employee Address: ");
        emp.setEmpAddress(in.nextLine());
        System.out.print("Enter Employee Salary: ");
        emp.setEmpSalary(in2.nextDouble());
        System.out.print("Enter Employee Designation: ");
        emp.setEmpDesignation(in.nextLine());
        System.out.print("Enter Employee Department: ");
        emp.setEmpDepartment(in.nextLine());
        emp.display();
    }
}



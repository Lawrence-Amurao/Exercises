package com.techelevator;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;
    private String fullName;

    public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }


    public String getFullName() {
        if (firstName != null && lastName != null) {
            return fullName = lastName + ", " + firstName;
        }
        else return null;
    }

    public void raiseSalary(double percent){
        if (percent > 0) {
            double raiseAmount = percent / 100;
            double inDollars = (annualSalary * raiseAmount);
            annualSalary += inDollars;
            System.out.println(fullName + ", gets a raise of: " + percent + " percent.");

        }
    }


}

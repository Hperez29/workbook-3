package com.pluralsight;

/**
 * Represents an employee with ID, name, hours worked, and pay rate.
 */
public class Employee {
    private final int employeeId;
    private final String name;
    private double hoursWorked;
    private double payRate;

    /**
     * Constructs an Employee object with the given details.
     *
     * @param employeeId  the unique employee ID
     * @param name        the employee's name
     * @param hoursWorked the number of hours worked
     * @param payRate     the hourly pay rate
     */
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    /**
     * Calculates and returns the gross pay based on hours worked and pay rate.
     *
     * @return the employee's gross pay
     */
    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}
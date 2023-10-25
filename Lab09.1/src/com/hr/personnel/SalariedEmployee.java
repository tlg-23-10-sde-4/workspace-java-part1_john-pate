package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
        super ();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn401K();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay() {
        double payment = getSalary();
        System.out.println(getName() + " is paid salary " + payment);
    }

    public void takeVacation() {
        System.out.println(getName() + " is on a nice vacation");
    }

    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (salary * 0.25));
    }



    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }

}
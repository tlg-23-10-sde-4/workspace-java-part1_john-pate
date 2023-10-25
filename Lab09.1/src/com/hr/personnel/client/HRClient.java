/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.Executive;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1175.0));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1275.0));
        dept.addEmployee(new HourlyEmployee("Jungus", LocalDate.of(1995, 6, 10), 28.0, 35));
        dept.addEmployee(new HourlyEmployee("Jubilant", LocalDate.of(1989, 11, 10), 32.0, 42));
        dept.addEmployee(new Executive("Jay", LocalDate.of(1986, 12, 5), 100_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // make its Employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // make SalariedEmployees take vacation
        System.out.println("\nForce holiday break");
        dept.holidayBreak();
    }
}
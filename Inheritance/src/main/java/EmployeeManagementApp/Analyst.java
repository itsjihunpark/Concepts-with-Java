/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeManagementApp;

/**
 *
 * @author Jihun
 */
public class Analyst extends Employee{


    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }


    public double getAnnualBonus() {
        return super.salary * .05;
    }


}


package BankingAppInheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jihun
 */
public class Employee extends Person{
    
    protected double salary;
    private int age;

    public Employee(String name, double salary, int age) {
       super(name);
       this.salary = salary;
       this.age = age;
   }


    public double getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulationbankapp;

/**
 *
 * @author Jihun
 */
public class BankAccount {
    //No setter is defined as owner should remain immutable
    private String owner; 
    //No setter is defined as the balance must not be 
    //allowed to be set to whatever balance the user wants
    private double balance; 
    
    public BankAccount(String owner, double startingBalance)
    {
        this.balance=Math.max(startingBalance, 0); //this way balance is never negative
        this.owner=owner;
    }
    
    
    public String getOwner()
    {
        return this.owner;
    }
    public double getBalance()
    {
        return this.balance;
    }
    
    public double withdraw(double amt)
    {
        if(amt<=this.balance){
            this.balance = this.balance-amt;
            return amt;
        }
        return 0;
    }
    public double deposite(double amt)
    {
        if(amt>0)
        {
            this.balance = this.balance+amt;
            return amt;
        }
        return 0;
    }
}   

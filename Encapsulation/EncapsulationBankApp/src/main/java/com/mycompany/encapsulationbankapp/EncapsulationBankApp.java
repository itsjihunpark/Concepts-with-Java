/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulationbankapp;

/**
 *
 * @author Jihun
 */
public class EncapsulationBankApp {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jihun Park", 1000);
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposite(5000);
        System.out.println(bankAccount.getOwner()+": "+bankAccount.getBalance());
    }
}

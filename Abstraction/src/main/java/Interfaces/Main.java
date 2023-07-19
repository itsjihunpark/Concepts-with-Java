/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Jihun
 */
public class Main {
    public static void main(String[] args){
        PasswordChangeEvent eventOne = new PasswordChangeEvent("1234");
        AccountTransferEvent eventTwo = new AccountTransferEvent("5678");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("0987");
        
        Event[] events = {eventOne, eventTwo, eventThree};
        
        for(Event e: events)
        {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.sql.Timestamp;

/**
 *
 * @author Jihun
 */
public class AccountTransferEvent extends AbstractEvent{
    
    public AccountTransferEvent(String id) {
        super(id);
    }    

    @Override
    public void process() {
        System.out.println("Customer "+id + " transferred their account. "
                 +"Sending a confirmation email to the customer.");
    }
}

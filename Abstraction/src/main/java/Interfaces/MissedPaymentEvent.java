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
public class MissedPaymentEvent extends AbstractEvent{


    public MissedPaymentEvent(String id) {
        super(id);
    }    
    
    @Override
    public void process() {
        System.out.println("Customer "+id + " missed their payment. "
                 +"Sending a bill to the customer.");
    }
    
}

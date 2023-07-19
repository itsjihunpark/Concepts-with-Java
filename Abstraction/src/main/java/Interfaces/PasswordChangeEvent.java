/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.sql.Timestamp;

/**
 * This event occurs when user changes their password
 * @author Jihun
 */
public class PasswordChangeEvent extends AbstractEvent{

    public PasswordChangeEvent(String id)
    {
        super(id);
    }

    @Override
    public void process() {
         System.out.println("Customer "+id + " changed their password. "
                 +"Sending a confirmation email to the customer.");
    }
    
}

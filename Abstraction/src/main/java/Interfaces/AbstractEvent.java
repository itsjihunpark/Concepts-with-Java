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
public abstract class AbstractEvent implements Event{
        
    protected final Long createdTimestamp;
    protected final String id;
    
    public AbstractEvent(String id)
    {
        this.id = id;
        this.createdTimestamp = new Timestamp(System
                .currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {return this.createdTimestamp;}

    @Override
    public abstract void process();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueuesNotes;

import java.util.ArrayList;

/**
 *
 * @author Jihun
 */
public class Queues {
     ArrayList<String> queuesList = new ArrayList();

    //FIFO
    //First in First Out
     
    //enqueue
    void enqueue(String item)
    {
        this.queuesList.add(item);
    } 
    //pop
    String dequeue(){
        
        String firstString=this.queuesList.get(0);
        if(this.queuesList.isEmpty()==false)
        {
            
            this.queuesList.remove(firstString);
            return firstString;
        }
        else{
            return null;
        }
    }
    //peak, retrieves it but doesn't remove it
    String peek(){
        String lastString=this.queuesList.get(0);
        if(this.queuesList.isEmpty()==false)
        {
            return lastString;
        }
        else{
            return null;
        }
    }
    public static void main(String[] args)
    {
        try{
        Queues myQueues = new Queues();
        myQueues.enqueue("Peggy");
        myQueues.enqueue("Larry");
        myQueues.enqueue("Serena");
        System.out.println(myQueues.peek());
        System.out.println(myQueues.peek());
        myQueues.dequeue();
  
        System.out.println(myQueues.peek());
        }
        catch(Exception e) //exception prevents system from crashing
        {
            System.out.println(e);
        }
        System.out.println("Program finished");
    }
    /**
     * Use cases of queues:
     * 1.Printer. If several people send a request to the printer at
     * approximately the same time, who ever reached the printer first
     * will have his copy done first and the rest will go to a queue
     * 
     * In operating systems, Queues are used to control access to shared system
     * resources such as printers, files, comm lines, discs and tapes
     * Queues are also frequently used in multi-threading and concurrency 
     * situations. To keep track of what tasks are awaiting to be performed and
     * making sure that we take them in that order
     * 
     * Queues work differently depending on which language we use them in
     * 
     * We could implement them with a linked list or a dynamic array in java
     * In C#, it has a Queue class which we can enqueue or dequeue
     * In python, we have a queue class where we can use put() and get()
     * instead of enqueue and dequeue
     * Python is targeted for working with threading so things like thread
     * Synchronisation
     * Same goes with Ruby which uses queues for synchronising communication
     * across threads
     * 
     * If you want standard queue functionality, you can use a standard ruby 
     * array class which is a dynamic array
     * - push() to add to the end
     * - shift() to remove and return the first element. Shift also shifts the 
     * array down by one
     * With JavaScript-use dynamic array with its dynamic array with push and
     * shift
     * With C++ there is a queue container in the standard template library
     * push_back() and pop_front
     * 
     * No matter what language, you should be able to find a library with
     * similar functionality to use or you can implement them yourself
     */
}

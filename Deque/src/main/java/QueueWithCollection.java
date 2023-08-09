/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jihun
 */
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueWithCollection {
    public static void main(String[] args)
    {
       Queue<Guest> guests = new ArrayDeque<>();
       Guest g1 = new Guest("Jihun", false);
       Guest g2 = new Guest("Daniel", false);
       Guest g3 = new Guest("Syed", true);
       Guest g4 = new Guest("Pasquale", true);
       
       //methods to use deque as a queue: 
       //.offer()-does not throw exception .add()-throws exception
       //.poll()-does not throw exceptions .remove()-throws exception
       //.element() does not throw exceptions .peek()-throws exception
       guests.offer(g1);
       guests.offer(g2);
       guests.offer(g3);
       guests.offer(g4);
       
              
       print(guests);
       System.out.println(guests.remove());
       print(guests);
       
       
       System.out.println(guests.peek());
       print(guests);
       
       
       
       //Priority queue; requires comparator. 
       Comparator<Guest> programComp = Comparator.comparing(Guest::isIsLoyaltyMember).reversed();
       Queue<Guest> guestsPriority = new PriorityQueue<>(programComp);
       
       guestsPriority.offer(g1);
       guestsPriority.offer(g2);
       guestsPriority.offer(g3);
       guestsPriority.offer(g4);
       System.out.println("Priority Queue");
       print(guestsPriority);
    }

    private static void print(Queue<Guest> q) {
        System.out.format("%n--Queue Contents--%n");
        int x = 0;
        for(Guest g: q)
        {
            System.out.format("%x: %s %s%s %n", x++,g,x==1?"(Head)":"", x==q.size()?"(tail)":"");
        }
        System.out.println("");
    }
}
class Guest{
    private String name;
    private boolean isLoyaltyMember;
    
    public Guest(String name, boolean l)   
    {
        this.name = name;
        this.isLoyaltyMember = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsLoyaltyMember() {
        return isLoyaltyMember;
    }

    public void setIsLoyaltyMember(boolean isLoyaltyMember) {
        this.isLoyaltyMember = isLoyaltyMember;
    }
    @Override
    public String toString()
    {
        return this.name;
    }
            
}

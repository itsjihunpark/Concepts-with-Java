/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListApplication;


/**
 *
 * @author Jihun
 */
import java.util.LinkedList; //importing LinkedList implentation by Java
public class Main {
    public static void main(String[] args){
        LinkedList travelBucketList = new LinkedList();
        
        //Adding items; a few different ways
        //just adding
        travelBucketList.add("Santorini, Greece");
        //adding to the front of the LL
        travelBucketList.addFirst("Barcelona, Spain");
        //adding to the back of the LL
        travelBucketList.addLast("Tokyo, Japan");
        //add to a specific index
        travelBucketList.add(2, "Galapagos Island, Ecuador");
        System.out.println(travelBucketList);
        
        //Access
        //.get function
        //appears to be like an array as we're using an index
        //Extremely inefficient because you need to follow all the pointers
        //to find that specific item
        System.out.println(travelBucketList.get(2)); 
        
        //Its better to access them from the front of the list
        //If this is not the way you want to access data and retrieve it, LL
        //may not be the best data structure for your particular use case
        System.out.println(travelBucketList.getFirst());
        
        //Serch
        System.out.println(travelBucketList.contains("Barcelona, Spain"));
        
        /**
         * Important note:
         * Similar to arrays you have to be careful of using these one liners
         * They look easy and simple, but behind the scenes they are 
         * Computationally expensive
        */
        
        //Remove items
        travelBucketList.removeFirst();
        travelBucketList.removeLast();
        System.out.println(travelBucketList);
        
        //Remove by objects or by index
        travelBucketList.remove("Santorini, Greece");
        travelBucketList.remove(0);
        System.out.println(travelBucketList);
        /**
         * Important note on data structure:
         * There are ways to organise, store and access your data no matter the
         * Programming language
        */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jihun
 */
public class Polymorphism {
    
    public static void addRandomNumber(ArrayList<Integer> list) 
    //notice how OddArrayList objects are allowed because OddArrayList is also an ArrayList
    //By having this method take in an ArrayList rather than a more specific
    //OddArrayList, we were able to create common functionality, this method can 
    //now be used by a variety of different instance types as long as they extend
    //ArrayList class. This makes our code more reuseable    
    {
        int originalSize = list.size();
        Random random = new Random();
        while(originalSize + 1 != list.size()) 
        // this is done so that this method implementation always adds a number
        // despite OddArrayList add method implementation only allowing odd number to be added
        {
            int n = random.nextInt(1000);
            list.add(n); 
        //Implementation of each add method is different and is determined at 
        //runtime based on instances/objects original type. Hence Runtime polymorphism
        }
        
    }

    public static void main(String[] args) {
        OddArrayList oddList = new OddArrayList();
        oddList.add(1);
        oddList.add(3);
        addRandomNumber(oddList);
        System.out.println(oddList);
        System.out.println(oddList.size());
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        addRandomNumber(list);
        System.out.println(list);
        System.out.println(list.size());
        
        
    }
}

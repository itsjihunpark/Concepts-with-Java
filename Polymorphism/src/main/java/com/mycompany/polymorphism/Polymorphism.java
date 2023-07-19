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
    {
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);
        if (list instanceof ConditionArrayList) 
        //if instance is of type ConditionArrayList, cast the list object and call function isEligible
        {
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n))
            {
                n = random.nextInt(1000);
                list.add(n);
            }
        }
        list.add(n);
        
    }

    public static void main(String[] args) {
        ConditionArrayList oddList = new ConditionArrayList(n -> Math.abs(n) % 2 ==1);
        oddList.add(1);
        oddList.add(3);
        addRandomNumber(oddList);
        System.out.println(oddList);
        System.out.println(oddList.size());
        
        ConditionArrayList evenList = new ConditionArrayList(n -> Math.abs(n) % 2 ==0);
        evenList.add(0);
        evenList.add(2);
        addRandomNumber(evenList);
        System.out.println(evenList);
        System.out.println(evenList.size());
        
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        addRandomNumber(list);
        System.out.println(list);
        System.out.println(list.size());
        
        
    }
}

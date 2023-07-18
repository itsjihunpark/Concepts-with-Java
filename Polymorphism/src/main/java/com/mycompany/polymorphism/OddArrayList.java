/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * ArrayList only containing odd numbers
 * @author Jihun
 */
public class OddArrayList extends ArrayList<Integer>
{
    //To ensure only odd numbers are added to this arraylist, 
    //We need to override some of the array list functionality
    //Methods like constructor, add, addAll, replaceAll, set will need to be modified
    public OddArrayList(Integer... nums)
    {
        super(Arrays.stream(nums)
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList()));
    }
    
    @Override
    public void add(int index, Integer element){
        if(isOdd(element)){
            super.add(index, element);
        }
    }
    @Override
    public boolean add(Integer element)
    {
        if(isOdd(element))
        {
            return super.add(element);
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList())); //Learn more about java collection and streams courses on linkedin learning
    }
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream()
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList())); //Learn more about java collection and streams courses on linkedin learning
    }
    
    @Override
    public Integer set(int index, Integer element){
        if(isOdd(element)){
            return super.set(index, element);
        }
        else{
            System.out.println(element + " is not odd");
            return Integer.MIN_VALUE;
        }
    }
    
    @Override
    public void replaceAll(UnaryOperator<Integer> operator) //run the operation and then remove
    {
        super.replaceAll(operator);
        super.removeIf(n->!isOdd(n));
    }
    
    public static boolean isOdd(Integer element){ //to reduce code redundancy
        return Math.abs(element) % 2 ==1;
    }
}

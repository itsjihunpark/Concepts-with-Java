/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compiletime.polymorphism;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Jihun
 */
public class CompiletimePolymorphism {

    public static void main(String[] args) {
        Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
        ConditionArrayList divisibleByThreeListy =
                new ConditionArrayList(isDivisibleByThree);

        ConditionArrayList divisibleByThreeListy2 =
                new ConditionArrayList(isDivisibleByThree,
                        1, 2, 3, 4, 5, 6, 9);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        ConditionArrayList divisibleByThreeListy3 =
                new ConditionArrayList(isDivisibleByThree,
                        numsList);

        Predicate<Integer> isDivisibleBySix = n-> Math.abs(n) % 6 ==0;
        ConditionArrayList divisibleBySix = new ConditionArrayList(isDivisibleBySix, divisibleByThreeListy); 
        //Constructor overloading, program decide which constructor to use based 
        //on number of inputs and arguments passed at compile time. Hence, 
        //compile time polymorphism

    }
}

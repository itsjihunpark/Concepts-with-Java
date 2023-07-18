/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Jihun
 */
public class Main {
    public static void main(String[] Args)
    {
        ModArrayList list = new ModArrayList();
        list.add(1);
        list.add(20);
        list.add(10);
        list.add(40);
        System.out.println(list.getUsingMod(1));
        System.out.println(list.getUsingMod(40));
        System.out.println(list.get(-2));
      
    }
}

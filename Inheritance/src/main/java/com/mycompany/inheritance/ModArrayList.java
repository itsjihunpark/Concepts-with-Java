/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

import java.util.ArrayList;

/**
 *
 * @author Jihun
 */
public class ModArrayList<D> extends ArrayList<D>{
    /**
     * Takes in an index and returns an object in the ModArrayList 
     * no matter what kind of index is passed into them
     * @param index
     * @return 
     */
    public D getUsingMod(int index){
         int validIndex = Math.abs(index)%this.size();
         return this.get(validIndex);
    }
}

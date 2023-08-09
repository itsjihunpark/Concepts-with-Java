/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jihun
 */
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class BinarySearch {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(1000);
        int target=59;
        for(int i =0; i<100; i++ )
        {
            numbers.add(i);
        }
        numbers = numbers.stream()
                .map(n->n+10)
                .collect(Collectors.toList());
        numbers.sort((n1,n2)->n1.compareTo(n2));
        System.out.println(numbers);
        
        int high=numbers.size()-1;
        int low=0;
        int index=-1;
        
        while(low<=high){
            int middle=low+(high-low)/2;
            int value = numbers.get(middle);
            System.out.println("middle "+middle);
            if(value > target){
                high = middle-1;
            }
            else if(value < target){
                low = middle+1;
            }
            else {
                index = middle;
                break;
            }
        }
        System.out.println(index);
        
        
        
    }
    
}

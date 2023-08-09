/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jihun
 */
import java.util.Deque;
import java.util.ArrayDeque;
public class StackWithDeque {
    
    public static void main(String[] args)
    {
        Deque<String> deque = new ArrayDeque<>();
        //.push() and .pop() to use this deque as a stack
        deque.push("First Item");
        deque.push("Second Item");
        deque.push("Third Item");
        deque.push("Fourth Item");
        print(deque);
        System.out.println(deque.pop());
        print(deque);
    }

    private static void print(Deque<String> deque) {
        System.out.format("%n--Deque Contents--%n");
        int x =0;
        for(String msg: deque)
        {
            System.out.format("%x: %s %s %n", x++, msg, x==1?"(Head)":"");
        }
    }
    
}

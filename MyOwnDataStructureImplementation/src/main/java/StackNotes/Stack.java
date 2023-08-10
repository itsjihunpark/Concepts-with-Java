/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackNotes;

/**
 *
 * @author Jihun
 */
import java.util.ArrayList;
public class Stack {
    /**
     * Some languages gives you the stack functionality outright
     * But with others, you have to use the tools given by other language to 
     * implement your own stack
     */
    
    //Implementation
    //What makes up a stack?
    //1. We need a way to store our items
    //2. We need a way to add, remove, and access our items
    
    ArrayList<String> stackList = new ArrayList();

    //push
    void push(String item)
    {
        this.stackList.add(item);
    } 
    //pop
    String pop(){
        
        String lastString=this.stackList.get(this.stackList.size()-1);
        if(this.stackList.isEmpty()==false)
        {
            
            this.stackList.remove(lastString);
            return lastString;
        }
        else{
            return null;
        }
    }
    //peak, retrieves it but doesn't remove it
    String peek(){
        String lastString=this.stackList.get(this.stackList.size()-1);
        if(this.stackList.isEmpty()==false)
        {
            return lastString;
        }
        else{
            return null;
        }
    }
    
    public static void main(String[] args)
    {
        //This stack assumes the back of the array is the top of our stack
        //and the front of the array is the bottom of our stack
        Stack s = new Stack();
        s.push("Heart: Queen"); 
        //when using this function, the developer doesn't need to know the 
        //implementation details of this function, as they're abstracted away
        s.push("Spade: Jack");
        s.push("Heart: 9");
        s.push("Diamond: 4");
//        System.out.println(s.stackList);
//        System.out.println(s.peek());
//        System.out.println(s.peek());
        
        String firstItemPopped = s.pop();
        String secondItemPopped = s.pop();
        String thirdItemPopped = s.pop();
        String fourthItemPopped = s.pop();
        //String fifthItemPopped = s.pop();
        System.out.println(firstItemPopped);
        System.out.println(secondItemPopped);
        System.out.println(thirdItemPopped);
        System.out.println(fourthItemPopped);
        //System.out.println(fifthItemPopped);
        
        //One of the common usecase of stacks include
        //runtime stack/ callstack error
        //You can retrace your steps and find error in your code
        
    }
}

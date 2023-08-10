/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedListNotes;

/**
 *
 * @author Jihun
 */

//This class defines a linked list
public class LinkedListFromScratch {
    
    /**
     * This implementation of LL is a Singly linked because they only have a 
     * pointer pointing to the next node of the list, only a next pointer
     * Therefore, this LL can only traverse forward through the list
     * 
     * We can make this LL a doubly linked list simply by 1) adding a pointer to
     * the Node class that points to the previous Node in the List 2) adding a 
     * tailNode attribute to the LinkedListFromScratch class
     * 
     */
    
    
    //LinkedList is just a bunch of nodes that has a pointer 
    //that points to the next node
    
    //You can access every node in a linked list 
    //if you have access to the head of the list
    Node head;
    
    public void add(int data)
    {
        //Two possibility
        //LL is empty
        if(this.head == null)
        {
            //new Node is the head;
            this.head = new Node(data);
        }
        //LL is not empty, hence need to adjust the head
        //and the next nodes accordingly
        else{
            Node nodeToAdd = new Node(data);
            //current head will be the next-pointer of the new node
            nodeToAdd.next = this.head; 
            //new node is now the head of the list of which
            //the next-pointer is the previous head
            this.head = nodeToAdd; 
        }
    }
    //driver
    public static void main(String[] args)
    {
        LinkedListFromScratch myList = new LinkedListFromScratch();
        myList.add(1); 
        myList.add(2);
        myList.add(3); //will be the new head
        System.out.println(myList.head.next); //Expected Output: 2
    }
    
}
//This class defines a node
//Node has data and access to the next node
class Node {
    int data; //data
    Node next; //access to the next node
    
    Node(int d){
        this.data = d;
    }
    @Override
    public String toString()
    {
        return "{data: "+this.data+" next-pointer to: "+this.next+"}" ;
    }
    
}
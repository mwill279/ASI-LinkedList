/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malac
 */
public class LinkedList {
    private Node head;
    
    
    public void addnode(int newdata){
        Node temp = new Node(newdata);
        Node current;
        if(head ==null){
            head = temp;
        }
        else{
            current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
    }
    
    
    
    
    
    
    
    public void deletenode(int olddata){
        Node current = null, prev = null;
        
        if(head.getData() == olddata){
            head = head.next;
        }
        else{
            current = head;
            while(current.getData() != olddata && current.next != null){
                prev = current;
                current = current.next;
            }
            
            prev.next = current.next;
            current.next = null;
        }
    }
    
    public void display(){
        Node current = head;
        
        while(current != null){
            System.out.print(current.getData() + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    
}

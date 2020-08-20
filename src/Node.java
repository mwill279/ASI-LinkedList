/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malac
 */
public class Node {
    private int data;
    Node next;
    
    public Node(){
        data = 0;
        next = null;
    }
    
    public Node(int newdata){
        data = newdata;
        next = null;
    }
    
    public void setdata(int newdata){
        data = newdata;
    }
    
    public int getData() {
        return data;
    }
    
}

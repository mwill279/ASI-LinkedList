/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malac
 */
public class LinkedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        
        mylist.addnode(8);
        mylist.addnode(5);
        mylist.addnode(2);
        mylist.addnode(3);
        mylist.addnode(4);
        mylist.addnode(1);
        
        mylist.display();
        
        mylist.deletenode(2);
        
        mylist.display();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author Master
 */
public class Node {
    int data;
    Node next;
    
    
    Node(int data)
    {
        this.data=data;
        next=null;
    }
    
    
    public static void insertNode(Node head,int value)
    {
        Node tempNode=new Node(value);
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        
        curr.next=tempNode;
       
    }
    
    
    public static Node insertAtPos(Node head, int pos, int value)
    {
        Node newNode = new Node(value);
        
        if(pos==1)
        {
            newNode.next=head;
            return newNode;
        }
        
        
        int i=1;
        Node curr=head;
        while(i<pos-1)
        {
            curr=curr.next;
            i++;
        }
        
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
        
        
    }
    
    
    
    
    
    
    
    
    public static Node deleteNode(Node head, int value){
        
        if(head.data==value)
        {
            return head.next;
        }
        
        Node curr=head;
        while(curr.next.data!=value)
        {
            curr=curr.next;
        }
        
        curr.next=curr.next.next;
        return head;
        
    }
    
    
    
    
    
    
    
    public static void printLinkedList(Node head)
    {
        Node curr=head;
        
        while(curr!=null)
        {
            System.out.print(curr.data+" --> ");
            curr=curr.next;
            
        }
        
    }
    
    
    
    
    
    
}

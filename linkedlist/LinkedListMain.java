/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author Master
 */
public class LinkedListMain {
    public static void main(String[] args) {
        Node head= new Node(10);
        Node.insertNode(head, 20);
        Node.insertNode(head, 30);
        Node.insertNode(head, 40);
        Node.insertNode(head, 50);
        Node.insertNode(head, 60);
        
        Node.printLinkedList(head);
        System.out.println();
        
              
        head=Node.deleteNode(head, 30);
        Node.printLinkedList(head);
        System.out.println();
        
        head=Node.deleteNode(head, 10);
        Node.printLinkedList(head);
        System.out.println();
        
        
        System.out.println("Inserting 100 at pos 3");
        head=Node.insertAtPos(head, 3, 100);
        Node.printLinkedList(head);
        System.out.println();
        
        System.out.println("Inserting 200 at pos 1");
        head=Node.insertAtPos(head, 1, 200);
        Node.printLinkedList(head);
    }
    
}

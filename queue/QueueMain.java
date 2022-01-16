/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

/**
 *
 * @author Master
 */
public class QueueMain {
    
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        q.printQueue();
        
        q.dequeue();
        System.out.println();
        q.printQueue();
                
    }
           
    
}

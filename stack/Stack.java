/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author Master
 */
public class Stack {
    int arr[];
    int capacity;
    int top;
    
    Stack(int capacity)
    {
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;        
    }
    
    public void push(int a)
    {
        if(top==capacity-1)
            System.out.println("Stack overflow!");
        else{
            arr[++top]=a;
        }
    }
    
    public int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        
        else{
            int num=arr[top];
            top--;
            return num;
           
        }
       
    }
    
    public int peek()
    {
        if(top==-1)
            return -1;
        
        return(arr[top]);
    }
    
    public void printStack()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" <-- ");
        }
    }
    
    
    
}

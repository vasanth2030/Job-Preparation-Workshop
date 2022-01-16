/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author Master
 */
public class StackMain {
    
    public static void main(String[] args) {
        Stack st=new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        st.printStack();
        
        st.pop();
        st.pop();
        System.out.println();
        st.printStack();
        
    }
    
    
}

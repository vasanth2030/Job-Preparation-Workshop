/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaworkshopjobpreparation;

/**
 *
 * @author Master
 */
class Functions {

    public static void main(String[] args) {
        Functions f=new Functions();
        f.printHelloWorld();
        
        int num1=5;
        int num2=6;
        int add=sum(num1,num2);
        System.out.println(add);
        

    }
    
    public void printHelloWorld()
    {
        System.out.println("Hello World");
    }
    
    public static int sum(int a,int b) //arguments / parameter
    {
        int c=a+b;
        return c;
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaworkshopjobpreparation;

import java.util.Scanner;

/**
 *
 * @author Master
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Start of program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int ans = divide(num1, num2);
            System.out.println(ans);
          
        } catch (Exception e) {
            System.out.println("Inside catch block");
            System.out.println(e);
           
        } finally {
            System.out.println("Inside finally block");

        }

//        try{
//        int n=8/0;
//        }
//        catch(Exception e)
//        {
//            System.out.println("You cannot divide a number by 0"); 
//            System.out.println(e);
//            
//        }
        System.out.println("End of program");
    }

    public static int divide(int a, int b) throws Exception {
        int div = a / b;
        return div;
//        throw new Exception("This is manually thrown");
    }

}

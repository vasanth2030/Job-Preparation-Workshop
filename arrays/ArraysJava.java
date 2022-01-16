/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author Master
 */
public class ArraysJava {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int arr[]=new int[n];
//        
//        //use loop to get values
//        
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("Enter the element:");
//            int element=sc.nextInt();
//            arr[i]=element;
//        }
//        
//        
//        System.out.println("The array: ");
//        printArray(arr);
//        System.out.println();
//        
//        
//        int sum=sumOfArray(arr);
//        System.out.println("The sum of array elements is: "+sum);
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110,120};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you want to search: ");
        int n=sc.nextInt();
        binarySearch(arr,n);

    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sumOfArray(int arr[]) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];      //sum=sum+arr[i];
        }

        return sum;
    }
    
    public static void linearSearch(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("Element found at index "+i);
                return;
            }
        }
        
        System.out.println("Element not found!");
        
        
    }
    
    public static void binarySearch(int arr[],int n)         
    {
        int l=0;
        int r=arr.length-1;
        
        while(l<=r)
        {
            int mid=(l+r)/2;
            
            if(arr[mid]==n)
            {
                System.out.println("Element found at index "+mid);
                return;
            }
            
            else if(arr[mid]<n)
                l=mid+1;
            
            else
                r=mid-1;
            
        }
        
        System.out.println("Element not found!");
        
        
    }
    
    

}

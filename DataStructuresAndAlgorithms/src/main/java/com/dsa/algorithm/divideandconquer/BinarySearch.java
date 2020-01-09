package com.dsa.algorithm.divideandconquer;


public class BinarySearch {
    int binarySearch(int arr[], int start, int end, int number) 
    { 
        if (end >= start) { 
            int mid = start + (end - start) / 2; 

            if (arr[mid] == number) 
                return mid; 
  
            if (arr[mid] > number) 
                return binarySearch(arr, start, mid - 1, number); 
  
            return binarySearch(arr, mid + 1, end, number); 
        } 
  
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110,120};//{ 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 120; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
    
} 

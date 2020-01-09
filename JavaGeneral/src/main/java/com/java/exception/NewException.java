package com.java.exception;

import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
	long power(int n, int p) throws Exception{
        
        if(n<0 || p<0){
          throw new Exception("n or p should not be negative.");  
        }
        else if(n==0 || p==0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (long)Math.pow(n,p);
        }
    }
}
public class NewException {
    public static final MyCalculator my_calculator = new MyCalculator();
    
    public static void main(String[] args) {
            try {
                System.out.println(my_calculator.power(10, 0));
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
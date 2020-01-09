package com.java.exception;

import java.util.Scanner;

public class ExceptionCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        try{
           int x = scan.nextInt();
       int y = scan.nextInt();
       if(x>2147483647||x<-2147483647) {
    	   throw new Exception("java.util.InputMismatchException");
       }
           System.out.println(x/y);
       }
       catch(Exception e){
           System.out.println(e.getClass().getName());
       }
	}

}


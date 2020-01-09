package com.dsa.hackerrank.interviews.booking.com;

import java.util.ArrayList;
import java.util.List;

public class MultiplesTest {
	 public static List<Integer> multiple(int x, int y, int z, int n) {
		    List<Integer> result = new ArrayList<Integer>();

		    for(int i=1;i<=n;i++){
		        if(x>0) {
		        	if((i%x==0) && (!isMultipleofZ(z,i))){
		        		 result.add(i);
		        		 continue;
		        	}
		        }
		        if(y>0) {
		        	if((i%y==0) && (!isMultipleofZ(z,i))){
		        		 result.add(i);
		        	}
		        }
		        
		    }
		    return result;
		    }
	 
	 static boolean isMultipleofZ (int z,int num) 
	 { 
	     while (num > 0) 
	         num = num - z; 
	   
	     if (num == 0) 
	         return true; 
	   
	     return false; 
	 } 
	public static void main(String[] args) {
		System.out.println(MultiplesTest.multiple(2, 4, 6, 15));
	}

}

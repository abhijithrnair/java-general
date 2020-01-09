package com.dsa.hackerrank.interviews.booking.com;

public class ElevatorSuperstition {
	 // Complete the getLuckyFloorNumber function below.
    static int getLuckyFloorNumber(int n) {
    	int result =0;
    	int[] real = new int[n];
    	int[] lucky = new int[n];
    	for(int i=0;i<n;i++) {
    		real[i]=i+1;
    	}
    	int instantI=1;
    	for(int i=0;i<n;i++) {
    		if(isValid(instantI)) {
    			lucky[i]=instantI;
    		}
    		else {
    			if(isValid(instantI+1)) {
    				lucky[i]=instantI+1;
    				instantI++;
    			}
    			else {
    				lucky[i]=instantI+2;
    				instantI =instantI+2;
    			}
    			
    			
    		}
    		instantI++;
    	}
    	int index = 0;
    	for(int i=0;i<=real.length-1;i++) {
    		if(real[i]==n) {
    			index = i;
    		}
    	}
    	if(index!=0) {
    		result = lucky[index];
    	}
    	System.out.print("Real:: ");
    	for(int a:real) {
    		System.out.print(a+" ");
    	}
    	System.out.println();
    	System.out.print("Lucky::");
    	for(int a:lucky) {
    		System.out.print(a+" ");
    	}
    	System.out.println();
    	return result;
    }
    
    static boolean isValid(int a) {
    	if(String.valueOf(a).contains("4") || String.valueOf(a).contains("13")) {
    		return false;
    	}
    	else {
    	return true;}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor = 12;
		System.out.println("Lucky number of "+floor+" is: "+getLuckyFloorNumber(floor));
	}

}

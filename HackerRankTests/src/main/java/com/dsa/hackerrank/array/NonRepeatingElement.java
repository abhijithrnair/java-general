package com.dsa.hackerrank.array;

public class NonRepeatingElement {
	public static int nonRepeatingElement(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) { 
            int j; 
            for (j = 0; j < n; j++) 
                if (i != j && arr[i] == arr[j]) 
                    break; 
            if (j == n) 
                return arr[i]; 
        } 
  
        return -1; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonRepeatingElement(new int[] {9,4,9,6,7,4}));
	}

}

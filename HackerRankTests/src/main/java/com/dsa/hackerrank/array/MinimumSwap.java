package com.dsa.hackerrank.array;

public class MinimumSwap {

	public static void main(String[] args) {
		int[] array = {2,1,5,3,4};
		minimumSwap(array);
	}

	static void minimumSwap(int[] arr) {
		int swapCount =0;
		for(int i = arr.length-1;i>=0;i--) {
		if(arr[i]!=i+1) {
			if(((i-1)>=0) && arr[i-1]==(i+1)) {
				swapCount++;
				swap(arr,i,i-1);
			}
			else if(((i-2)>=0) && arr[i-2]==(i+1)) {
				swapCount+=2;
				swap(arr,i-2,i-1);
				swap(arr,i-1,i);
			}
			else {
				System.out.println("too chaotic");
				return;
			}
		}
		}
		System.out.println(swapCount);
	}
	
	static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a]=array[b];;
		array[b]=temp;
	}
}

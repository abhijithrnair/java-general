package com.dsa.sorting.selectionsort;

public class Selectionsort {
	
	void selectionSort(int arr[]) {
		for (int j=0;j<arr.length;j++) {
			int minIndex = j;
			for (int i=j+1; i<arr.length; i++) {
				if (arr[i] < arr[minIndex]) //find which is the smallest element to right of 'j'
					minIndex = i;
			}//end of inner loop
			if (minIndex != j) { // if j is not minimum index then swap
				int temp = arr[j];
				arr[j] = arr[minIndex];
				arr[minIndex] = temp;
			}
			
		}
	}
	
	void printArray(int arr[]) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

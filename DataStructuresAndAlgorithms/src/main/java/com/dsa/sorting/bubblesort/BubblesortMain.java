package com.dsa.sorting.bubblesort;

public class BubblesortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,20,10,50,60,40,80};
		Bubblesort bs = new Bubblesort();
		System.out.println("Array before sorting");
		bs.printArray(arr);
		bs.bubbleSort(arr);
		System.out.println();
		System.out.println("Array after sorting");
		bs.printArray(arr);
	}

}

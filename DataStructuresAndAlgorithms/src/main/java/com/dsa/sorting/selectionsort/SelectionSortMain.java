package com.dsa.sorting.selectionsort;

public class SelectionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,20,10,50,60,40,80};
		Selectionsort ss = new Selectionsort();
		System.out.println("Array before sorting");
		ss.printArray(arr);
		ss.selectionSort(arr);
		System.out.println();
		System.out.println("Array after sorting");
		ss.printArray(arr);
	}

}

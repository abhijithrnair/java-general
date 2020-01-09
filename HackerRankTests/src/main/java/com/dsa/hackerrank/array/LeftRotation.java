package com.dsa.hackerrank.array;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter n");
//		int n = Integer.parseInt(scanner.nextLine());
//		System.out.println("Enter d");
//		int d = Integer.parseInt(scanner.nextLine());
//		int[] a = new int[n]; // { 1, 2, 3, 4, 5 };
//		String[] aItems = scanner.nextLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
//        scanner.close();
		int[] a = { 1, 2, 3, 4, 5 };
		int d=2;
		leftRotate(a, d);
	}
	
	static int[] leftRotate(int[] a, int d) {
		int size = a.length;
		int[] rotatedArray = new int[size];
		int i = 0;
		int rotateIndex = d;
		while(rotateIndex<size) {
			rotatedArray[i]=a[rotateIndex];
			i++;
			rotateIndex++;
		}
		rotateIndex =0;
		while(rotateIndex<d) {
			rotatedArray[i]=a[rotateIndex];
			i++;
			rotateIndex++;
		}
//		for(int num:rotatedArray)
//			System.out.print(" "+num);
		return rotatedArray;
	}
} 

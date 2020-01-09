package com.dsa.hackerrank.array;

public class LeftRotate {

	 // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] rotatedArray = new int[a.length];
        int rotatedArrayIndex = 0;
        for(int i =d;i<a.length;i++){
            rotatedArray[rotatedArrayIndex]=a[i];
            rotatedArrayIndex++;
        }
        for(int j =0;j<d;j++){
            rotatedArray[rotatedArrayIndex]=a[j];
            rotatedArrayIndex++;
        }
    return rotatedArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LeftRotate.rotLeft(new int[] {1,2,3,4,5}, 4));
	}

}

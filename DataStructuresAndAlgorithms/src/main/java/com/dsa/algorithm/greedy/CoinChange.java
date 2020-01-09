package com.dsa.algorithm.greedy;

import java.util.Arrays;
import java.util.Stack;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 299;
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int maxDenomination = 1000;
		Stack<Integer> result =new Stack<Integer>();
		while(n!=0) {
			maxDenomination = findLargestDenominationLesserThanN(coins, n);
			n=n-maxDenomination;
			result.push(maxDenomination);
		}
		System.out.println(result);
	}

	static int findLargestDenominationLesserThanN(int[] coins, int n) {
		int size = coins.length;
		int maxDenomination = 0;
		Arrays.sort(coins);
		for(int i=0;i<size;i++) {
			if(coins[size-1-i]<=n) {
				maxDenomination = coins[size-1-i]; 
				break;
			}
		}
		return maxDenomination;
	}
}

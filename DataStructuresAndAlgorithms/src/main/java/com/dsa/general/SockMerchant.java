package com.dsa.general;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		   Set<Integer> set = new TreeSet<Integer>(); 
	        for(int number:ar) {
	            set.add(number);
	        }
	        int matchedPairCount =0;
	        for(int number:set){
	            int occurences =0;
	            for(int i=0;i<ar.length;i++) {
	            	if(number == ar[i]) {
	            		occurences++;
	            	}
	            }
	            matchedPairCount = matchedPairCount+occurences/2;
	        }
	        return matchedPairCount;
    }

	public static void main(String[] args) throws IOException {
		System.out.println(sockMerchant(10,new int []{10,20,20,10,10,30,50,10,20} ));
    }
}

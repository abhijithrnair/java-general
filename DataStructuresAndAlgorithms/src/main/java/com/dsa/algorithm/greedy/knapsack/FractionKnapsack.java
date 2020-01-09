package com.dsa.algorithm.greedy.knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionKnapsack {

	static void knapSack(ArrayList<FractionalKnapsackItem> items, int capacity) {

		Comparator<FractionalKnapsackItem> comparator = new Comparator<FractionalKnapsackItem>() {

			@Override
			public int compare(FractionalKnapsackItem o1, FractionalKnapsackItem o2) {
				if (o1.getRatio() > o2.getRatio()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(items, comparator);
		int usedCapacity = 0;
		double totalValue = 0;
		for (FractionalKnapsackItem item : items) {
			if(usedCapacity+ item.getWeight()<=capacity) {
				usedCapacity+=item.getWeight();
				System.out.println("Taken: "+item);
				totalValue+=item.getValue();
			}
			else {
				//else consume fractionally
				int usedWeight = capacity - usedCapacity;
				double value = item.getRatio()*usedWeight;
				System.out.println("Taken: "+"item index = " + item.getIndex() + ",obtained value = " + value + ",used weight = " + usedWeight + ", ratio = " + item.getRatio()
						+ "]");
				usedCapacity+=usedWeight;
				totalValue+=value;
			}
			//if capacity is full then break
			if(usedCapacity==capacity)break;
		}
		System.out.println("\nTotal value obtained: "+ totalValue);
	}
}

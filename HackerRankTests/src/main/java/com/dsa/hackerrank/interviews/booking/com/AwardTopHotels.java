package com.dsa.hackerrank.interviews.booking.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AwardTopHotels {
	public static List<Integer> awardTopKHotels(String positiveKeywords, String negativeKeywords,
			List<Integer> hotelIds, List<String> reviews, int k) {
		List<Integer> result = new ArrayList<Integer>();

		HashMap<Integer, Integer> reviewsMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < hotelIds.size(); i++) {
			reviewsMap.put(hotelIds.get(i),
					((reviewsMap.get(hotelIds.get(i)) != null) && (reviewsMap.get(hotelIds.get(i)) > 0))
							? reviewsMap.get(hotelIds.get(i))
							: 0);
			int positiveCount = countOccurences(positiveKeywords, reviews.get(i));
			int negativeCount = countOccurences(negativeKeywords, reviews.get(i));
			if (positiveCount > 0) {
				reviewsMap.put(hotelIds.get(i), reviewsMap.get(hotelIds.get(i)) + 3 * positiveCount);
			}
			if (negativeCount > 0) {
				reviewsMap.put(hotelIds.get(i), reviewsMap.get(hotelIds.get(i)) - (1*negativeCount));
			}
		}
		List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(reviewsMap.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		for (Entry<Integer, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		for (int i = 0; i < sortedMap.size(); i++) {
			int key = (int) sortedMap.keySet().toArray()[i];
			result.add(key);
			if (result.size() >= k) {
				break;
			}
		}
		return result;
	}

	static int countOccurences(String keywords, String word) {
		List<String> a = Arrays.asList(keywords.split(" "));
		List<String> b = Arrays.asList(word.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split(" "));
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (b.get(j).equals(a.get(i))) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String positiveKeywords = "breakfast beach citycenter location metro view staff price";
		String negativeKeywords = "not";
		List<Integer> hotelIds = new ArrayList<Integer>();
		hotelIds.add(1);
		hotelIds.add(2);
		hotelIds.add(1);
		hotelIds.add(1);
		hotelIds.add(2);
		List<String> reviews = new ArrayList<String>();
		reviews.add("This hotel has a nice view of the citycenter. The location is perfect.");
		reviews.add(
				"The breakfast is ok. Regarding location, it is quite far from citycenter but price is cheap so it is worth.");
		reviews.add(
				"Location is excellent, 5 minutes from citycenter. There is also a metro station very close to the hotel.");
		reviews.add("They said I couldn't take my dog and there were other guests with dogs! That is not fair.");
		reviews.add("Very friendly staff and good cost-benefit ratio. Its location is a bit far from citycenter.");
		int k = 2;

		System.out.println(awardTopKHotels(positiveKeywords, negativeKeywords, hotelIds, reviews, k));

	}

}

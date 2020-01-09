package com.dsa.hackerrank.interviews.booking.com;

import java.util.ArrayList;
import java.util.List;

public class ReservationIds {
	public static List<Integer> missingReservations(List<List<Integer>> firstReservationList,
			List<List<Integer>> secondReservationList) {
		List<Integer> id1 = new ArrayList<Integer>();
		for (int i = 0; i < firstReservationList.size(); i++) {
			id1.add(firstReservationList.get(i).get(0));
		}

		List<Integer> id2 = new ArrayList<Integer>();
		for (int i = 0; i < secondReservationList.size(); i++) {
			id2.add(secondReservationList.get(i).get(0));
		}
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < id2.size(); i++) {
			if (!id1.contains(id2.get(i))) {
				result.add(id2.get(i));
			}
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1234);
		l1.add(532632);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(234);
		l2.add(632633);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(2354);
		l3.add(732634);
		
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(1234);
		l4.add(532632);
		List<Integer> l5 = new ArrayList<Integer>();
		l5.add(234);
		l5.add(632633);
		List<Integer> l6 = new ArrayList<Integer>();
		l6.add(458);
		l6.add(642633);
		List<Integer> l7 = new ArrayList<Integer>();
		l7.add(2354);
		l7.add(732634);
		 
		List<List<Integer>> firstReservationList = new ArrayList<List<Integer>>();
		firstReservationList.add(l1);
		firstReservationList.add(l2);
		firstReservationList.add(l3);

		List<List<Integer>> secondReservationList = new ArrayList<List<Integer>>();
		secondReservationList.add(l4);
		secondReservationList.add(l5);
		secondReservationList.add(l6);
		secondReservationList.add(l7);
		ReservationIds.missingReservations(firstReservationList, secondReservationList);
	}

}

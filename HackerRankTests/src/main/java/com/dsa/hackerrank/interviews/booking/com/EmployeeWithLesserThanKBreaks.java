package com.dsa.hackerrank.interviews.booking.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeWithLesserThanKBreaks {
	public static List<List<Integer>> employeeWithLesserThanKBreaks(List<List<Integer>> employeeCalls, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<List<Integer>> sortedEmployeeCalls = employeeCalls;
		Collections.sort(sortedEmployeeCalls, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		HashMap<Integer, Integer> ids = new HashMap<Integer, Integer>();
		for (int i = 0; i < employeeCalls.size(); i++) {
			ids.put(employeeCalls.get(i).get(0), 0);
		}

		for (int i = 0; i < ids.size(); i++) {
			int key = (int) ids.keySet().toArray()[i];
			int empLogId = 0;
			for (int j = 0; j < sortedEmployeeCalls.size() - 1; j++) {
				empLogId = sortedEmployeeCalls.get(j).get(0);
				if (key == empLogId) {
					if (sortedEmployeeCalls.get(j).get(0) == sortedEmployeeCalls.get(j + 1).get(0)) {
						int diff = sortedEmployeeCalls.get(j + 1).get(1) - sortedEmployeeCalls.get(j).get(2);
						if (diff != 0) {
							ids.put(key, ids.get(key) + 1);
						}
					}
				}
			}
		}
		for (int i = 0; i < ids.size(); i++) {
			int key = (int) ids.keySet().toArray()[i];
			int value = ids.get(key);
			if (value < k) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(key);
				list.add(value);
				result.add(list);
			}
		}
		Collections.sort(result,new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(1).compareTo(o2.get(1));
			}
		});
		return result;
	}

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(1481122000);
		l1.add(1481122020);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(1481122000);
		l2.add(1481122020);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(1);
		l3.add(1481122020);
		l3.add(1481122040);
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(2);
		l4.add(1481122020);
		l4.add(1481122040);
		List<Integer> l5 = new ArrayList<Integer>();
		l5.add(3);
		l5.add(1481122040);
		l5.add(1481122060);
		List<Integer> l6 = new ArrayList<Integer>();
		l6.add(1);
		l6.add(1481122050);
		l6.add(1481122060);
		List<Integer> l7 = new ArrayList<Integer>();
		l7.add(3);
		l7.add(1481122070);
		l7.add(1481122090);

		List<List<Integer>> employeeCalls = new ArrayList<List<Integer>>();
		employeeCalls.add(l1);
		employeeCalls.add(l2);
		employeeCalls.add(l3);
		employeeCalls.add(l4);
		employeeCalls.add(l5);
		employeeCalls.add(l6);
		employeeCalls.add(l7);

		System.out.println(EmployeeWithLesserThanKBreaks.employeeWithLesserThanKBreaks(employeeCalls, 2));
	}

}

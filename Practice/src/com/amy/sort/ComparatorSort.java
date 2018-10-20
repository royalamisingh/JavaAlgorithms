package com.amy.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 9, 23, 34, 53, 8, 7);

		Collections.sort(list);

		list.forEach(i -> System.out.println(i));

		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}
		};
		System.out.println("----------------Reverse Order-----------------");

		Collections.sort(list, c);
		
		list.forEach(i -> System.out.println(i));
	}

}

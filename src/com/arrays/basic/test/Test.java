package com.arrays.basic.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(10);
		lists.add(al);
		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(11);
		al2.add(13);
		al2.add(14);
		al2.add(15);
		al2.add(10);
		lists.add(al2);
		System.out.println(lists);
		for (List<Integer> list1 : lists) {
			for (Integer integer : list1) {
				System.out.print(integer+" ");
			}
			System.out.println();

		}
	}
}
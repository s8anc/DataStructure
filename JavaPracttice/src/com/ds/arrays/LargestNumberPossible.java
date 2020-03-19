package com.ds.arrays;

import java.util.Arrays;

public class LargestNumberPossible {
	
	public static void findLargestNumber(Integer[] arr){
//		Comparator<Integer> c = new Comparator<Integer>() {
//
//			public int compare(Integer i1, Integer i2) {
//				return (""+i2+i1).compareTo(""+i1+i2);
//			}
//		};
		
		Arrays.sort(arr , (i1,i2) -> (""+i2+i1).compareTo(""+i1+i2));
		
		String largestNum="";
		for(int a:arr){
			largestNum += a;
		}
		System.out.println(largestNum);
		
	}

	public static void main(String[] args) {
		Integer[] arr = {10,68,75,7,21,12};
		System.out.println(Arrays.toString(arr));
		findLargestNumber(arr);
	}

}

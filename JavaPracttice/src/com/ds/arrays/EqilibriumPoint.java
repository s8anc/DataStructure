package com.ds.arrays;

import java.util.stream.IntStream;

public class EqilibriumPoint {
	
	public static void findEqilibriumPoint(int[] arr){
		int sum = IntStream.of(arr).sum();
		int rightSum = 0;
		int len = arr.length;
		int i = len-1;
		while(i>=0){
			int leftSum = sum-(arr[i]+rightSum);
			if(rightSum==leftSum){
				System.out.println(arr[i]);
			}
			rightSum += arr[i];
			i--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,7,-8,2,4,6};
		EqilibriumPoint.findEqilibriumPoint(arr);
		System.out.println("####################################");
		int[] arr1 = {5,7,-24,2,4,6,0};
		EqilibriumPoint.findEqilibriumPoint(arr1);
	}

}

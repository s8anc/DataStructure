package com.ds.arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
	//{4, 2, -3, 1, 6}
	// 4  6   3  4  10
	public static void findZeroSumSubArray(int[] arr){
		int sum = 0;
		int l =arr.length;
		Set<Integer> set = new HashSet<>();
		for(int i =0; i<l; i++){
			sum += arr[i];
			if(sum == 0 || set.contains(sum)){
				System.out.println("Phew zero sum sub array found!!");
				return;
			}
			set.add(sum);
		}
		System.out.println("No zero sum sub array found :(");
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 2, -3, 1, 6};
		ZeroSumSubArray.findZeroSumSubArray(arr);
		
		System.out.println();
		int arr1[] = {4, 2, 3, 1, 6};
		ZeroSumSubArray.findZeroSumSubArray(arr1);
		
		System.out.println();
		int arr2[] = {4, 7, 3, 1, 6,-10,15};
		ZeroSumSubArray.findZeroSumSubArray(arr2);
		
		System.out.println();
		int arr3[] = {4, 2, -6, 3, 5, 6};
		ZeroSumSubArray.findZeroSumSubArray(arr3);
		
		System.out.println();
		int arr4[] = {1, 0, 3, 5, 6};
		ZeroSumSubArray.findZeroSumSubArray(arr4);
		

	}
}

package com.ds.arrays;

public class LargestSumContiguousSubarray {
	
	public static void findLargestSumContiguousSubarray(int[] arr){
		int maxSoFar = arr[0]; 
		int currMax = arr[0];
		for(int i=1;i<arr.length;i++){
			currMax = Math.max(arr[i], currMax+arr[i]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		System.out.println(maxSoFar);
		
	}

	public static void main(String[] args) {
		int arr[] = {4, 2, -3, 1, 6};
		LargestSumContiguousSubarray.findLargestSumContiguousSubarray(arr);
		
		int arr1[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		LargestSumContiguousSubarray.findLargestSumContiguousSubarray(arr1);
		
		int arr3[] = {-4, -9, -3, -10, -6};
		LargestSumContiguousSubarray.findLargestSumContiguousSubarray(arr3);
	}

}

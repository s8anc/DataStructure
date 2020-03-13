package com.ds.arrays;

public class LargestSumSubarray {
	//using Math.max()
	public static void findLargestSumSubarray(int[] arr){
		int maxSoFar = arr[0]; 
		int currMax = arr[0];
		for(int i=1;i<arr.length;i++){
			currMax = Math.max(arr[i], currMax+arr[i]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		System.out.println(maxSoFar);
	}
	//using Kadane's Algo
	//-2, -3, 4, -1, -2, 1, 5, -3
	//0	  0	  4	  3   1  2  7   4
	//0	  0   4   4   4  4  7   7
	public static void findLargestSumSubarrayUsingKadane(int[] arr){
		int currMax = 0;
		int maxSoFar = 0;
		for(int i=0; i<arr.length; i++){
			currMax = currMax + arr[i];
			if(currMax < 0)
				currMax = 0;
			if(currMax > maxSoFar)
				maxSoFar = currMax;
		}
		System.out.println(maxSoFar);
	}
	

	public static void main(String[] args) {
		int arr1[] = {4, 2, -3, 1, 6};
		LargestSumSubarray.findLargestSumSubarray(arr1);
		
		int arr2[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		LargestSumSubarray.findLargestSumSubarray(arr2);
		
		int arr3[] = {-4, -9, -3, -10, -6};
		LargestSumSubarray.findLargestSumSubarray(arr3);
		
		
		LargestSumSubarray.findLargestSumSubarrayUsingKadane(arr1);
		LargestSumSubarray.findLargestSumSubarrayUsingKadane(arr2);
		LargestSumSubarray.findLargestSumSubarrayUsingKadane(arr3);//doesnt work for all -ve values
		
		
	}

}

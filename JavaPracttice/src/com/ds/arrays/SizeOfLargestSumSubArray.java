package com.ds.arrays;

public class SizeOfLargestSumSubArray {

	public static void findSizeOfLargestSumSubArray(int[] arr){

		int currMax = 0;
		int maxSoFar = 0;
		int start = -1;
		int end = -1;
		for(int i=0; i<arr.length; i++){
			currMax = currMax + arr[i];
			if(currMax < 0)
				currMax = 0;
			if(currMax > maxSoFar){
				if(start == -1){
					start = i;
				}
				end = i;
				maxSoFar = currMax;
			}
				
		}
		System.out.println("size : "+(end-start+1));
		System.out.println(maxSoFar);
	
	}
	
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		SizeOfLargestSumSubArray.findSizeOfLargestSumSubArray(arr);
	}

}

package com.ds.arrays;

//sliding window problem
public class MinimumSumSubArrayofGivenSizeK {
	
	public static void findSubArray(int[] arr, int k){
		if(arr.length<k){
			return;
		}
		int minSum = 0;
		int minSumIndex=-1;
		int sumAtI = 0;

		for(int i = 0;i<k;i++){
			sumAtI+=arr[i];
		}
		minSum = sumAtI;
		
		for(int i = k;i<arr.length;i++){
			sumAtI = sumAtI-arr[i-k]+arr[i];
			if(sumAtI<minSum){
				minSum = sumAtI;
				minSumIndex = i;
			}
		}
		System.out.println(minSum);
		System.out.println("Index "+(minSumIndex-k+1)+","+minSumIndex);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 2, 5, 6, 3, 8, 1 };
		findSubArray(arr, 3);
	}

}

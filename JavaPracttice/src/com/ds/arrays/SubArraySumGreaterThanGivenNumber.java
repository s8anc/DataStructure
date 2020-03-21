package com.ds.arrays;


//sliding window problem
public class SubArraySumGreaterThanGivenNumber {
	
	public static void findSubArray(int[] arr, int k){
		
		int sumAtI = arr[0];
		int left = 0;
		int minLen = Integer.MAX_VALUE;
		int minLenIndex = -1;
		for(int i=1;i<arr.length;i++){
			sumAtI += arr[i];
			while(sumAtI>k && left<=i){
				if((i-left+1)<minLen){
					minLen = i-left+1;
					minLenIndex = i;
				}
				sumAtI -= arr[left];
				left++;
			}
		}
		System.out.println("Minimum length : "+minLen);
		System.out.println("Index : "+(minLenIndex-minLen+1)+","+minLenIndex);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 1, 3, 5, 6, 4, 9, 14 };
		findSubArray(arr, 12);
		
		int[] arr1 = { 8, 1, 3, 5, 6, 4, 9, 2 };
		findSubArray(arr1, 12);
	}

}

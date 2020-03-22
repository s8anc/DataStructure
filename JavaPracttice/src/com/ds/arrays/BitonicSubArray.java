package com.ds.arrays;

public class BitonicSubArray {
	
	public static void findBitonicSubArray(int[] arr){
		int maxLen = -1;
		int maxLenIndex = -1;
		int i=1;
		while(i<arr.length){
			int len =1;
			while(i<arr.length && arr[i]>arr[i-1]){
				len++;
				i++;
			}
			while(i<arr.length && arr[i]<arr[i-1]){
				len++;
				i++;
			}
			if(maxLen<len){
				maxLen = len;
				maxLenIndex = i-1;
			}
		}
		System.out.println(maxLen);
		System.out.println(maxLenIndex);
		
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };
		findBitonicSubArray(arr);
	}

}

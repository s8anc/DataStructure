package com.ds.arrays;

public class SeconndLargestElement {
	
	public static void findSeconndLargestElement(int[] arr){
		int max =arr[0];
		int secondMax =Integer.MIN_VALUE;
		for(int i=1; i< arr.length;i++){
			if(arr[i]>max){
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax){
				secondMax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}

	public static void main(String[] args) {
		int[] arr = {1,3,9,4,6,0,7};
		SeconndLargestElement.findSeconndLargestElement(arr);
		
		int[] arr1 = {-8,-3,-9,-4,-6,-7};
		SeconndLargestElement.findSeconndLargestElement(arr1);
	}

}

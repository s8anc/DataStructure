package com.ds.arrays;

public class LargestElement {
	
	public static void findLargestElement(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]> max)
				max = arr[i];
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] arr = {1,3,9,4,6,0,7};
		LargestElement.findLargestElement(arr);
		
		int[] arr1 = {-8,-3,-9,-4,-6,-7};
		LargestElement.findLargestElement(arr1);
	}

}

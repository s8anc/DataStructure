package com.ds.arrays;

import java.util.Arrays;

public class RearrangeArrayWithAlternateHighLowElements {
	
	private static void rearrangeArray(int[] arr) {
		for(int i=1;i<arr.length; i+=2){
			if(arr[i]<arr[i-1]){
				swap(arr,i,i-1);
			}
			if(i+1<arr.length && arr[i]< arr[i+1]){
				swap(arr,i,i+1);
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = { 9, 6, 8, 3, 7,4 };
		System.out.println(Arrays.toString(arr));
		rearrangeArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}

package com.ds.arrays;

import java.util.Arrays;

//Dutch national flag problem
public class SortArrayOf0s1s2s {
	
	public static void sort(int[] arr){
		int start = 0, mid = 0;
		int end=arr.length-1;
		int pivot = 1;
		while(mid<end){
			if(arr[mid]<pivot){
				swap(arr,start,mid);
				start++;
				mid++;
			}
			else if(arr[mid]>pivot){
				swap(arr,mid,end);
				end--;
			}
			else{
				mid++;
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,0,1,2,1,2,1,2,0,0,2};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

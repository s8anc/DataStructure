package com.algo.sort;

import java.util.Arrays;


//more efficient than selection sort and bubble sort
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {15,3,9,5,1,4,7};
		int l = arr.length;
		int i,j,k;
		for(i=1; i<l; i++){
			for(j=i-1,k=i; j>=0; j--,k--){
				if(arr[k] < arr[j]){
					int tmp = arr[k];
					arr[k] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("After sorting : "+Arrays.toString(arr));
	}
}

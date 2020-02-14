package com.algo.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {9,3,5,1,4,7};
		int l = arr.length;
		
		for(int i=0; i<l-1; i++){
			int iMin=i;
			for(int j=i+1; j<l; j++){
				if(arr[j]<arr[iMin]){
					iMin=j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

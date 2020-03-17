package com.ds.arrays;

import java.util.Arrays;

public class MoveAll0sToEnd {
	
	public static void MoveAll0sToEnd(int arr[]){
		int k = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				arr[k++] = arr[i];
			}
		}
		for(int j=k;j<arr.length;j++){
			arr[k++]=0;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		System.out.println(Arrays.toString(arr));
		MoveAll0sToEnd(arr);
		System.out.println(Arrays.toString(arr));
	}

}

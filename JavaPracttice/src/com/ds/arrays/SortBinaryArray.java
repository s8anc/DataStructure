package com.ds.arrays;

import java.util.Arrays;

class SortBinaryArray
{
	public static void sort(int[] arr)
	{
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[k++] = 0;
			}
		}
		for(int j=k;j<arr.length;j++){
			arr[j] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main (String[] args)
	{
		int arr[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
		sort(arr);
	}
}

package com.ds.arrays;

import java.util.Arrays;
import java.util.Random;

public class ShuffleGivenArrayOfElements {
	
	public static void shuffle(int[] arr){
		Random random = new Random();
		for(int i=arr.length-1; i>1; i--){
			int j = random.nextInt(i+1);
			swap(arr,i,j);
		}
	}
	
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		shuffle(arr);
		System.out.println(Arrays.toString(arr));
	}

}

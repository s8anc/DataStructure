package com.algo.sort;

import java.util.Arrays;


public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={6,5,4,3,2,1};
		int l=arr.length;
		
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		for(int i=0; i<l-1; i++){
			for(int j=0;j<l-1-i; j++){
				if(arr[j]>arr[j+1]){
					int tmp;
					tmp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		}
		
		System.out.println("After sorting : "+Arrays.toString(arr));
	}
/*time complexity
 * (n-1)*(n-1)*t
 * tn^2-2tn+t
 * O(n^2)
 * */
}

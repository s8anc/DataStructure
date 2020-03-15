package com.ds.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
	
	//O(nlog(n)) without extra space --sorting
	public static void findPairUsingSorting(int[] arr, int sum){
		Arrays.sort(arr);
		
		int low = 0;
		int high = arr.length-1;
		
		while(arr[low]<arr[high]){
			if(arr[low]+arr[high] == sum){
				System.out.println(arr[low]+" "+arr[high]);
				return;
			}
			if(arr[low]+arr[high]<sum){
				low++;
			}
			else{
				high--;
			}
		}
		System.out.println("Not found");
	}
	//O(n) using hashing with e=auxillary space O(n)
	public static void findPair(int[] arr, int sum){
		Set<Integer> set = new HashSet();
		for(int i=0;i<arr.length;i++){
			if(set.contains(sum-arr[i])){
				System.out.println(arr[i]+" "+(sum-arr[i]));
				
			}
			set.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = {8,4,6,9,5,3,1};
		PairWithGivenSum.findPairUsingSorting(arr, 10);
		System.out.println("############################################");
		PairWithGivenSum.findPair(arr, 10);
	}

}

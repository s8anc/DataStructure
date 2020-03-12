package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLargetZeoSumSubArray {
	public static void findLengthOfLargetZeoSumSubArray(int[] arr){
		int sum = 0;
		int l =arr.length;
		int maxLen = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0; i<l; i++){
			sum += arr[i];
			if(map.containsKey(sum)){
				System.out.println("Phew zero sum sub array found!!");
				System.out.println("start index : "+(map.get(sum)+1));
				System.out.println("end index : "+i );
				if(i - map.get(sum) > maxLen){
					maxLen = i - map.get(sum);
				}
			}
			if(sum == 0){
				System.out.println("Phew zero sum sub array found!!");
				System.out.println("start index : "+0);
				System.out.println("end index : "+i );
				if(i+1  > maxLen){
					maxLen = i+1;
				}
			}
			if(!map.containsKey(sum))
			map.put(sum,i);
		}
		System.out.println(maxLen);
		if(maxLen==0)
			System.out.println("No zero sum sub array found :(");
	}
	
	public static void main(String[] args) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		LengthOfLargetZeoSumSubArray.findLengthOfLargetZeoSumSubArray(arr);
		
		
		System.out.println();
		int arr1[] = {1, 0, 3, 5, 6};
		LengthOfLargetZeoSumSubArray.findLengthOfLargetZeoSumSubArray(arr1);
		
		System.out.println();
		int arr2[] = {1, 2, 3, 5, 6};
		LengthOfLargetZeoSumSubArray.findLengthOfLargetZeoSumSubArray(arr2);
	}
}

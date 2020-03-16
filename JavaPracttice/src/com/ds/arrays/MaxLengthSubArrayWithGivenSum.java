package com.ds.arrays;

import java.util.HashMap;
//		0	1	2	3	4	5	6	7	8
//		5,	6,	-5,	5,	3,	5,	3,	-2,	0
//sum	5	11	6	11	14	19	22	20	20
//-8	-3	3	-2	3	6	11	14	12	12
public class MaxLengthSubArrayWithGivenSum {
	
	public static void findSubArray(int[] arr, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if(map.containsKey(sum-k)){
				System.out.println("Sub array found.");
				return;
			}
			map.put(sum, i);
		}
		System.out.println("No sub array found.");
	}
	
	public static void findLargestSubArray(int[] arr, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int len = -1; //to keep track of the length of largest arr
		int start = -1;
		int end = -1;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if(map.containsKey(sum-k)){
				if((i-map.get(sum-k)) > len)
				{
					len = (i-map.get(sum-k));
					start = map.get(sum-k)+1;
					end = i;
				}
			}
			if(!map.containsKey(sum)){
				map.put(sum, i);
			}
		}
		System.out.println("Largest sub array len : "+len);
		System.out.println(start+","+end);
	}

	public static void main(String[] args) {
		int[] arr = {5,6,-5,5,3,5,3,-2,0};
		findSubArray(arr, 8);
		findLargestSubArray(arr, 8);
	}

}

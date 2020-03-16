package com.ds.arrays;

import java.util.HashMap;

public class MaxLengthSubArrayWith0s1s {
	
	//having equal number of 0 and 1
	public static void findSubArrayWithMaxLength(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int len = -1; //to keep track of the length of largest arr
		int start = -1;
		int end = -1;
		for(int i=0;i<arr.length;i++){
			sum += (arr[i]== 0 ? -1:1);
			if(map.containsKey(sum)){
				if((i-map.get(sum)) > len)
				{
					len = (i-map.get(sum));
					start = map.get(sum)+1;
					end = i;
				}
			}
			if(!map.containsKey(sum)){
				map.put(sum, i);
			}
		}
		if(len!=-1){
			System.out.println("Largest sub array len : "+len);
			System.out.println(start+","+end);
		}
	}

	public static void main(String[] args) {
		int[] arr = {0,0,1,0,1,0,1,1,1,0,1,0};
		findSubArrayWithMaxLength(arr);
	}

}

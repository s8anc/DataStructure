package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

class MajorityElement
{
	// Function to return majority element present in given array
	public static void majorityElement(int[] A)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int a: A){
			if(map.containsKey(a)){
				int c = map.get(a)+1;
				if(c>A.length/2){
					System.out.println("Majority element : "+a);
					return;
				}
				map.put(a, c);
				
			}
			else{
				map.put(a, 1);
			}
		}
		System.out.println("Not found!");
	}

	// main function
	public static void main (String[] args)
	{
		// Assumption - valid input (majority element is present)
		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 2, 2 ,2 ,5, 4};
		majorityElement(arr);
	}
}

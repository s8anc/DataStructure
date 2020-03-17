package com.ds.arrays;

public class MaxProductOfTwoIntegers {
	
	public static void findMaxProduct(int[] arr){
		int largest = Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i:arr){
			if(i>largest){
				secondLargest = largest;
				largest=i;
			}
			else if(i>secondLargest){
				secondLargest = i;
			}
			if(i<smallest){
				secondSmallest = smallest;
				smallest = i;
			}
			else if(i<secondSmallest){
				secondSmallest = i;
			}
		}
		if(largest*secondLargest > smallest*secondSmallest){
			System.out.println("Max product : "+(largest*secondLargest ));
		}
		else{
			System.out.println("Max product : "+(smallest*secondSmallest ));
		}
	}

	public static void main(String[] args) {
		int[] arr = {3,7,-12,5,4,15,9,-13};
		findMaxProduct(arr);
	}

}

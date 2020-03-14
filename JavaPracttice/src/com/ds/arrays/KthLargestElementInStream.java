package com.ds.arrays;

import java.util.PriorityQueue;

public class KthLargestElementInStream {
	
	
	public static void findKthLargest(int[] arr,int k){
		if(arr.length<k){
			return;
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<arr.length; i++){
			int e = arr[i];
			if(pq.size()<k){
				pq.add(e);
			}
			else{
				if(e>pq.peek()){
					pq.remove();
					pq.add(e);
				}
			}
			if(pq.size()>=3){
				System.out.println(pq.peek());
			}
			else{
				System.out.println("NA");
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 11, 70, 50, 40, 100, 5};
		KthLargestElementInStream.findKthLargest(arr, 3);
	}

}

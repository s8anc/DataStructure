package com.ds.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfRunningStream {
	
	public static void findMedian(int[] arr){
		int med = arr[0];
		System.out.println(med);
		
		PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> max = new PriorityQueue<>();
		
		min.add(arr[0]);
		
		for(int i=1;i<arr.length;i++){
			int x = arr[i];
			
			if(min.size() < max.size()){
				if(x>med){
					min.add(max.remove());
					max.add(x);
				}
				else{
					min.add(x);
				}
				med = (min.peek()+max.peek())/2;
			}
			
			else if(min.size() > max.size()){
				if(x<med){
					max.add(min.remove());
					min.add(x);
				}
				else{
					max.add(x);
				}
				med = (min.peek()+max.peek())/2;
			}
			
			else if(min.size() == max.size()){
				if(x<=med){
					min.add(x);
					med = min.peek();
				}
				else{
					max.add(x);
					med = max.peek();
				}
			}
		System.out.println(med);	
		}
		
	}
	

	public static void main(String[] args) {
		int[] arr = {5,15,10,20,3};
		MedianOfRunningStream.findMedian(arr);
	}

}

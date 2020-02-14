package com.string;

import java.util.Arrays;

public class StringPermutation {
	private static char[] chArr;
	public static void main(String[] args) {
		String input="abhishek";
		StringPermutation sp=new StringPermutation();
		chArr=input.toCharArray();
		sp.permute(chArr, 0, chArr.length-1);
	}
	
	public void permute(char[] chArr,int l,int r){
		if(l == r){
			System.out.println(Arrays.toString(chArr));
		}
		else{
			for(int i=l; i<=r; i++){
				swap(l,i);
				permute(chArr,l+1,r);
				swap(l,i);
				
			}
		}
	}
	public void swap(int a, int b){
		char tmp = chArr[a];
		chArr[a] = chArr[b];
		chArr[b] = tmp;
	}
}

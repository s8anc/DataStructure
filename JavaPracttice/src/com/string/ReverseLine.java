package com.string;

public class ReverseLine {

	public static void main(String[] args) {
		String s=new String("What is Java");
		StringBuffer revLine = new StringBuffer();
		String word;
		String rev;
		int l = s.length();
		int j=0;
		for(int i=0; i<l; i++){
			if(s.charAt(i) == ' '){
				word = s.substring(j, i);
				rev = ReverseLine.reverseWord(word);
				revLine.append(rev).append(" ");
				j=i+1;
			}
		}
		word=s.substring(j, l);
		rev = ReverseLine.reverseWord(word);
		revLine.append(rev);
		System.out.println(ReverseLine.reverseWord(revLine.toString()));		
	}
	public static String reverseWord(String word){
		int l=word.length();
		char[] rev=new char[l];
		int i,j;
		for(i=l-1,j=0;i>=0;i--,j++){
			rev[j]=word.charAt(i);
		}
		return new String(rev);
	}

}

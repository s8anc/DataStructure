package com.ds;

import java.util.Stack;

public class StackEX {
	public static void main(String[] args) {
		String s="{}[(}{)]";
		Stack st=new Stack();
		int l=s.length();
		for(int i=0; i<l;i++){
			char ch = s.charAt(i);
			if(ch=='{' || ch=='[' || ch=='('){
				st.push(ch);
			}
			
			if(ch=='}' || ch==']' || ch==')'){
				char last = (Character) st.lastElement();
				if(ch == '}'){
					if(last == '{'){
						st.pop();
					}
					else{
						System.out.println("invalid 1");
						break;
					}
				}
				else if(ch == ']'){
					if(last == '['){
						st.pop();
					}
					else{
						System.out.println("invalid 2");
						break;
					}
				}
				else{
					if(last == '('){
						st.pop();
					}
					else{
						System.out.println("invalid 3");
						break;
					}
				}
			}
			
		}
		
		if(st.size()==0){
			System.out.println("valid");
		}
		
		
		
	}
}

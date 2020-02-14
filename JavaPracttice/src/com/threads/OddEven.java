package com.threads;

public class OddEven {
	private int num=1;
	
	public synchronized void printOdd(){
		try {
			for(int i=0;i<5;i++){
				if(num%2==0){
					wait();
				}
				System.out.println(num);
				num = num+1;
				notify();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public synchronized void printEven(){
		try {
			for(int i=0;i<5;i++){
				if(num%2==1){
					wait();
					
				}
				System.out.println(num);
				num = num+1;
				notify();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		final OddEven oddEven = new OddEven();
		
		Thread odd=new Thread(){
			public void run(){
				oddEven.printOdd();
			}
		};
		odd.setPriority(10);
		
		Thread even=new Thread(){
			public void run(){
				oddEven.printEven();
			}
		};
		even.setPriority(5);
		odd.start();
		even.start();

	}

}

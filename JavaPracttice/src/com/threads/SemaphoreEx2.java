package com.threads;


public class SemaphoreEx2 {

	private static boolean met1=false;
	private static boolean met2=false;
	
	public void method1(){
		try {
			synchronized(this) {
				met1=true;
				while(met2){
					wait();
				}
			}
			System.out.println("start of method 1");
			Thread.sleep(2000);
			System.out.println("end of method 1");
			synchronized(this) {
				met1=false;
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void method2(){
		try {
			synchronized(this) {
				met2=true;
				while(met1){
					wait();
				}
			}
			System.out.println("start of method 2");
			Thread.sleep(2000);
			System.out.println("end of method 2");
			synchronized(this) {
				met2=false;
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		final SemaphoreEx2 ex=new SemaphoreEx2();
		Thread t1=new Thread(){
			public void run(){
				ex.method1();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				ex.method2();
			}
		};
		Thread t3=new Thread(){
			public void run(){
				ex.method2();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
	}
}

package com.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
	private static Semaphore semaphore = new Semaphore(1);
	
	public void method1(){
		try {
			semaphore.acquire();
			System.out.println("start of method 1");
			Thread.sleep(2000);
			System.out.println("end of method 1");
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void method2(){
		try {
			semaphore.acquire();
			System.out.println("start of method 2");
			Thread.sleep(2000);
			System.out.println("end of method 2");
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		final SemaphoreEx ex=new SemaphoreEx();
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

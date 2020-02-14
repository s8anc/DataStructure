package com.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SemaphoreEx1 {
	private static Lock lock = new ReentrantLock();
	
	public void method1(){
		try {
			lock.lock();
			System.out.println("start of method 1");
			Thread.sleep(2000);
			System.out.println("end of method 1");
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void method2(){
		try {
			lock.lock();
			System.out.println("start of method 2");
			Thread.sleep(2000);
			System.out.println("end of method 2");
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		final SemaphoreEx1 ex=new SemaphoreEx1();
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

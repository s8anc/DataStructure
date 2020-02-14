package com.threads;

public class Balance {
	private int amount = 10000;
	public synchronized void withdraw(int amt){
		try {
			System.out.println("going to withdraw..");
			if(amount<amt){
				System.out.println("waiting for deposit..");
				wait();
			}
			amount = amount-amt;
			System.out.println("withdraw completed..");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public synchronized void deposit(int amt){
		System.out.println("going to deposit..");
		this.amount = this.amount+amt;
		System.out.println("deposit completed..");
		notify();
		
	}
	public static void main(String[] args) {
		final Balance bal = new Balance();
		
		Thread withdraw = new Thread(){
			public void run(){
				bal.withdraw(5000);
			}
		};
		
		Thread deposit = new Thread(){
			public void run(){
				bal.deposit(20000);
			}
		};
		withdraw.start();
		deposit.start();
	}
}

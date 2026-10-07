package com.thread.funtions;

import java.util.Iterator;

public class Main extends Thread{
	static int count=0;
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hellow is am thread no :"+i);
		}
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Main t1=new Main();
		Main t2=new Main();
		Main t3=new Main();
		
		t1.start();
		System.out.println(count);
		t2.start();
		t3.start();
		t2.join();
		System.out.println(count);
		t3.join();
		System.out.println(count);
		
	}
}

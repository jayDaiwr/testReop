package com.offcn.test03;

public class Test05 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Thread(()->{
			for(int i=0;i<99;i++){
				System.out.println("t"+i);
			}
		});
		thread.start();
		
		for(int i=0;i<99;i++){
			if(i==30){
				thread.join();
			}
			System.out.println("main"+i);
		}
	}
}

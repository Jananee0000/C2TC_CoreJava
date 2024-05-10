package com.tnsif.multithreading;

public class ChildThread extends Thread{
	int n;
	String msg;
	
	public ChildThread(int n,String msg){
		this.n=n;
		this.msg=msg;
	}
	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
			Thread.sleep(3000);
			}catch(InterruptedException ex) {
				System.err.println(ex.getMessage());
			}
			System.out.println(msg + i);
		}
	}
	

}

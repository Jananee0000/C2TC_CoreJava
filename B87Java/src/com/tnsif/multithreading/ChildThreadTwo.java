package com.tnsif.multithreading;

public  class ChildThreadTwo implements Runnable{
	int i,h;
	String msg;
	Thread t;
	
	ChildThreadTwo(int i,int h,String msg){
		this.i=i;
		this.h=h;
		this.msg=msg;
		t=new Thread(this,"msg");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=h;i>1;i--) {
			try {
			Thread.sleep(1000);
			}catch(InterruptedException ex) {
				System.err.println(ex.getMessage());
			}
			System.out.println(msg + i);
		}
	}

}

package md.home.cady;

import java.util.ArrayList;
import java.util.Random;

public class Second {
			private ArrayList<Integer> list1 = new ArrayList<Integer>();
			private ArrayList<Integer> list2 = new ArrayList<Integer>();
			Object o1 = new Object();
			Object o2 = new Object();
			Random x = new Random();		
	private void partOne(){
		synchronized (o1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			list1.add(x.nextInt(111));
		}
	}
	private void partTwo(){
		synchronized (o2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			list2.add(x.nextInt(111));
		}
	}
	private void proceed(){
			for(int i=0; i<1000; i++){
				partOne();
				partTwo();
		}		
	}	
	public void start(){
			System.out.println("Begin...");
			long startTime = System.currentTimeMillis();
			Thread t1 = new Thread (new Runnable(){
				@Override
				public void run(){
					proceed();
				}
			});
			Thread t2 = new Thread (new Runnable(){
				@Override
				public void run(){
					proceed();
				}
			});		
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
			}			
			long stopTime = System.currentTimeMillis();
			System.out.println("Time spent: "+(stopTime-startTime)+"\n"
					+"Sent:     "+list1.size()+"\n"
					+"Recieved: "+list2.size());
	}
}

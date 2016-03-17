package md.home.cady;

import java.util.concurrent.ArrayBlockingQueue;

public class Queue {
	private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<Object>(1000);
	
	public static void main(String[] args){
		addObject();
		proceed();
	}
	private static void proceed() {
		System.out.println(list.size());
		for(Object x: list){
			list.remove(x);
		}
		System.out.println(list.size());
	}
	private static void addObject() {
		for(int i=0; i<10; i++){
			list.add(new Object());
		}
	}
}

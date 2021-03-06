package thread;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {
	private final int[] array;
	private int writeIndex=0;
	private final static Random generator = new Random();
	
	public SimpleArray(int size){
		array = new int[size];
	}
	
	public synchronized void add(int value){
		
		int position = writeIndex;
		try {
			Thread.sleep(generator.nextInt(500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		array[position] = value;
		
		System.out.printf("%s wrote %d in position %d\n", Thread.currentThread().getName(), value, position);
		
		++writeIndex;
		
		System.out.println("Next write position " + writeIndex);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Content of array: " + Arrays.toString(array);
	}
}

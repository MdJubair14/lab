package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
	public static void main(String[] args){
		SimpleArray s = new SimpleArray(6);
		
		ArrayWritter a1 = new ArrayWritter(s, 1);
		ArrayWritter a2 = new ArrayWritter(s, 10);
		
		ExecutorService e = Executors.newCachedThreadPool();
		
		e.execute(a1);
		e.execute(a2);
		
		e.shutdown();
		
		try {
			boolean end = e.awaitTermination(1, TimeUnit.MINUTES);
			
			if(end){
				System.out.println(s);
			}
			else
				System.out.println("Timed out while waiting for tasked to finished");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

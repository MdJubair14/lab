package thread;

public class ArrayWritter implements Runnable{

	private final SimpleArray sharedSimpleArray;
	private final int startValue;
	
	public ArrayWritter(SimpleArray array, int startValue){
		this.sharedSimpleArray = array;
		this.startValue = startValue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = startValue; i < startValue+3; i++) {
			sharedSimpleArray.add(i);
		}
	}
}

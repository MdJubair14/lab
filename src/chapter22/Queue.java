/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 8:12:50 PM
 * chapter22
 */
public class Queue<T> {
	private List<T> queueList;
	
	public Queue(){
		queueList = new List<T>("Queue");
	}
	
	public void enqueue(T object){
		queueList.insertAtBack(object);
	}
	
	public T dequeue() throws EmptyListException{
		return queueList.removedFromFront();
	}
	
	public boolean isEmpty(){
		return queueList.isEmpty();
	}
	
	public void print(){
		queueList.print();
	}
}

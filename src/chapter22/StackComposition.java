/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 7:54:19 PM
 * chapter22
 * @param <T>
 */
public class StackComposition<T> {
	private List<T> stackList;
	
	public StackComposition(){
		stackList = new List<T>("Stack");
	}
	
	public void push(T object){
		stackList.insertAtFront(object);
	}
	
	public T pop() throws EmptyListException{
		return stackList.removedFromFront();
	}
	
	public boolean isEmpty(){
		return stackList.isEmpty();
	}
	
	public void print(){
		stackList.print();
	}
}

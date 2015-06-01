/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 7:45:32 PM
 * chapter22
 * @param <T>
 */
public class StackInheritance<T> extends List<T>{
	public StackInheritance(){
		super( "Stack" );
	}
	
	public void push(T object){
		insertAtFront(object);
	}
	
	public T pop() throws EmptyListException{
		return removedFromFront();
	}
}

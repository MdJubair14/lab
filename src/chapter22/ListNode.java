/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 1:18:30 PM
 * chapter22
 */
public class ListNode<T> {
	T data;
	ListNode<T> nextNode;
	
	public ListNode(T object){
		this(object, null);
	}
	
	public ListNode(T object, ListNode<T> nextNode){
		this.data = object;
		this.nextNode = nextNode;
	}
	
	T getData(){
		return data;
	}
	
	ListNode<T> getNext(){
		return nextNode;
	}
}

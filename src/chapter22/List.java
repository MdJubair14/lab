/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 1:27:23 PM
 * chapter22
 */
public class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	
	public List(){
		this("List");
	}
	
	public List(String name){
		this.name = name;
		firstNode = lastNode = null;
	}

	public void insertAtFront(T insertName){
		if( isEmpty() ){
			firstNode = lastNode = new ListNode<T>(insertName);
		}
		else
			firstNode = new ListNode<T>(insertName, firstNode);
	}

	public void insertAtBack(T insertName){
		if( isEmpty() ){
			firstNode = lastNode = new ListNode<T>(insertName);
		}
		else
			lastNode = lastNode.nextNode = new ListNode<T>(insertName);
	}
	
	public T removedFromFront() throws EmptyListException{
		if( isEmpty() ) 
			throw new EmptyListException(name);
		T removedItem = firstNode.data;
		
		if(firstNode == lastNode){
			firstNode = lastNode = null;
		}
		else
			firstNode = firstNode.nextNode;
		
		return removedItem;
	}
	
	public T removedFromBack() throws EmptyListException{
		
		if( isEmpty() ){
			throw new EmptyListException();
		}
		
		T removedItem = lastNode.data;
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else{
			ListNode<T> current = firstNode;
			
			while(current.nextNode != lastNode){
				current = current.nextNode;
			}
			
			lastNode = current;
			current.nextNode = null;
		}
		
		return removedItem;
	}
	
	private boolean isEmpty() {
		return firstNode == null;
	}
	
	public void print(){
		if( isEmpty() ){
			System.out.println(name + " is empty");
			return;
		}
		
		System.out.printf("This %s is: ", name);
		ListNode<T> current = firstNode;
		
		while(current != null){
			System.out.printf(" %s ", current.data);
			current = current.nextNode;
		}
		
		System.out.println("\n");
	}
}

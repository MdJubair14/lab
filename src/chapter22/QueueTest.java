/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 8:17:19 PM
 * chapter22
 */
public class QueueTest {
	public static void main(String[] args){
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enqueue(-1);
		queue.print();
		queue.enqueue(0);
		queue.print();
		queue.enqueue(1);
		queue.print();
		queue.enqueue(5);
		queue.print();
		
		try{
			int removedItem;
			
			while(true){
				removedItem = queue.dequeue();
				System.out.printf("%d removed\n", removedItem);
				queue.print();
			}
		}
		catch(EmptyListException e){
			e.printStackTrace();
		}
	}
}

/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 4:29:26 PM
 * chapter22
 */
public class ListTest {
	public static void main(String[] args){
		List<Integer> list = new List<Integer>();
		
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();
		
		
		try {
			int removedItem = list.removedFromFront();
			System.out.printf("%d removed\n", removedItem);
			list.print();
			
			removedItem = list.removedFromFront();
			System.out.printf("%d removed\n", removedItem);
			list.print();
			
			removedItem = list.removedFromBack();
			System.out.printf("%d removed\n", removedItem);
			list.print();
			
			removedItem = list.removedFromBack();
			System.out.printf("%d removed\n", removedItem);
			list.print();
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		
	}
}

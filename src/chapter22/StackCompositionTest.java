/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 7:59:40 PM
 * chapter22
 */
public class StackCompositionTest {
	public static void main(String[] args){
		StackComposition<Integer> stack = new StackComposition<Integer>();
		
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
		stack.push(5);
		stack.print();
		
		
		try {
			int removedItem;
			
			while(true){
				removedItem = stack.pop();
				System.out.printf("%d removed\n", removedItem);
				stack.print();
			}
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

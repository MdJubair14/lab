/**
 * 
 */
package chapter22;

/**
 * @author iit
 * Jun 1, 2015
 * 3:48:42 PM
 * chapter22
 */
public class EmptyListException extends RuntimeException {

	public EmptyListException(){
		this( "List" );
	}
	public EmptyListException(String name) {
		super(name + "is empty");
	}

}

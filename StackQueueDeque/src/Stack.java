/**
* A collection of objects that are inserted and removed according to the last-in
* first-out principle. Although similar in purpose, this interface differs from
* java.util.Stack.*/
public interface Stack<E> {
	int size( );
	boolean isEmpty( );
	void push(E e);
	E top( );
	E pop( );
}

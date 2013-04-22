
public class Node <T>{
  
	private T element;
	private Node<T> next;
	private int key;
	
	public Node()
	{
		this(0,null, null);
	}
	
	public Node(int theKey,T theElement, Node<T> theNode)
	{
		key = theKey;
		element = theElement;
		next = theNode;
		
	}
	
	public T getElement()
	{
		return element;
	}
	
	public Node<T> getNext()
	{
		return next;
	}
	
	public void setElement(T newElement)
	{
		element = newElement;
	}
	
	public void setNext(Node<T> theNext)
	{
		next = theNext;
	}
	
	public int getKey()
	{
		return key;
	}
	

}

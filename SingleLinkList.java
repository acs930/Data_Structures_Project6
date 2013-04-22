


public class SingleLinkList {
  
	private Node firstNode;
	private int length;
	
	public SingleLinkList()
	{
		firstNode = null;
		length = 0;
	}
	
	public void clear()
	{
		firstNode = null;
		length = 0;
	}
	
	public boolean add(Node newEntry)
	{
		if(isEmpty() == true)
		{
			firstNode = newEntry;
		}
		
		else
		{
			Node lastNode = getNodeAt(length);
			newEntry.setNext(lastNode);
			firstNode = newEntry;
		}
		length++;
		
		return true;
	}
	
	  public boolean add(int newPosition, Node newEntry) // OutOfMemoryError possible                                                  
	  {
	   boolean isSuccessful = true;
 

	    if (isEmpty() || (newPosition == 1))       // case 1: add to beginning of list
	    {
	     newEntry.setNext(firstNode);       
	     firstNode = newEntry;
	    }
	    else                               // case 2: list is not empty and newPosition > 1
	    {
	     Node nodeBefore = getNodeAt(newPosition - 1);
	     Node nodeAfter = nodeBefore.getNext();
	     newEntry.setNext(nodeAfter);
	     nodeBefore.setNext(newEntry);
	    } // end if 
	   
	    length++;
	    
	   return isSuccessful;
	   // end add
	  }
	
	public Node getNodeAt(int position)
	{
		assert !isEmpty() && (1 <= position) && (position <= length);
		Node currentNode = firstNode;
		  
		    // traverse the list to locate the desired node
		for (int counter = 1; counter < position; counter++)
		currentNode = currentNode.getNext();
		  
		assert currentNode != null;
		return currentNode;		
	}
	
	public boolean isEmpty()
	{
		if(length == 0 )
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	public int getLength()
	{
		return length;
	}
	
	  public void display()
	  {
	      //System.out.println("Displaying chain");
	   // iterative
	   Node currentNode = firstNode;
	  while (currentNode != null)
	  {

			 System.out.println(currentNode.getElement());
			 currentNode = currentNode.getNext(); 
		 
	  } // end while  

	  }

}

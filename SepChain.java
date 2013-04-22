
public class SepChain {
  
	private SingleLinkList[] hTable;
	//private SingleLinkedList tableList;
	private Node element;
	private int length;
	
	public SepChain()
	{
		element = new Node();
		length = 31;
		hTable = new SingleLinkList[length];
		for(int i = 0; i < hTable.length; i ++)
		{
			hTable[i] = new SingleLinkList();
			//hTable[i].add(element);
		}
		//hTable[0].clear();
		//System.out.println(hTable[0].isEmpty());
		//tableList = new SingleLinkedList();
		
	}
	
	public SepChain(int newLength)
	{
		element = new Node();
		length = newLength;
		hTable = new SingleLinkList[length];
		for(int i = 0; i < hTable.length; i ++)
		{
			hTable[i] = new SingleLinkList();
			//hTable[i].add(element);
		}
	}
	
	public void addToTable(int key, Node newElement)
	{
		SingleLinkList tableList = hTable[key];
		//tableList = hTable[key];

		//hTable[key].add(newElement);
		//hTable[key] = tableList;
		if(tableList.isEmpty() == true)
		{

			hTable[key].add(1, newElement);
		}
		else
		{
			element = (Node) hTable[key].getNodeAt(0);
			newElement.setNext(element);
			hTable[key].add(1, newElement);
			
		}
	}
	
	public boolean containsKey(int theKey)
	{
		if(hTable[theKey].isEmpty())
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
	}
	
	public int numOccurences(int theKey, int wordKey)
	{
		int count = 0;
		for(int i = 0; i < hTable[theKey].getLength(); i ++)
		{
			if(hTable[theKey].getNodeAt(i).getKey() == wordKey)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public void display()
	{
		for(int i = 0; i < hTable.length; i ++)
		{
			if(hTable[i].isEmpty() == false)
			{
				System.out.println("At Key " + i + ":");
			hTable[i].display();
			}
		}
	}
	
	public int getLength()
	{
		return length;
	}
	
	public static void main(String[] args)
	{
		SepChain test = new SepChain();
		Node t1 = new Node(3,"The", null);
		Node t2 = new Node(3, "Like", null);
		
		test.addToTable(t1.getKey(), t1);
		test.addToTable(t2.getKey(), t2);
		test.display();
	}

}

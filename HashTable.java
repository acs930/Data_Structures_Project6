
//public class HashTable {
  import java.util.Hashtable;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

	public class HashTable
	{
	    public static void main(String[] args)
	    {
	    	
	    	
	    	
	        String fileName;
	        System.out.println("Type the name of the file");
	        Scanner nameOfFile = new Scanner(System.in);
	        Scanner inputStream = null;
	        Scanner input = new Scanner(System.in);
	        fileName = nameOfFile.nextLine();
	       
	        System.out.println("Enter table size: ");
	        int theLength = input.nextInt();
	        
	        SepChain hashTable = new SepChain(theLength);
	        
	       System.out.println("The file " + fileName + 
	                           "\ncontains the following lines:\n");
	        
	           
	       try
	       {
	           inputStream = new Scanner(new File(fileName));
	       }
	      catch(FileNotFoundException e)
	       {
	           System.out.println("Error opening the file " + 
	                               fileName);
	           System.exit(0);
	       }
		   
	       while (inputStream.hasNext())
	       {
	    	   while((!inputStream.hasNext(" ")) && (inputStream.hasNext()))
	    	   {
	    		   String Word = inputStream.next();
	    		   int key = getHashCode(Word);
	    		   int tableKey = key% theLength;
	    		   //System.out.println(tableKey);
	    		   Node tableNode = new Node(key, Word, null);
	    		  
	    		   hashTable.addToTable(tableKey, tableNode);
	    		   
	    		  
	    		   /*if(theTable.containsKey(key))
	    		   {
	    			   tableNode = new Node(key, Word, theTable.get(key));
	    		   }
	    		   else
	    		   {
	    			   tableNode = new Node(key, Word, null);
	    		   }
	    		   
	    		   theTable.put(key, Word);*/
	    	   }
	           //String line = inputStream.nextLine();
	          // System.out.println(Word);
	    	   
	       }
	       inputStream.close();
	       
	      hashTable.display();
	      
	      System.out.println("Enter the word to count");
	      String searchWord = input.next();
	      //searchWord += " ";
	      
	      System.out.println("The word occurred " + countNumOccurrences(searchWord, hashTable) + " times.");
	    }
	    
	    
	    
	    public static int getHashCode(String theWord)
	    {
	    	int HashCode = 0;
	    	for(int i = 0; i < theWord.length(); i ++)
	    	{
	    		HashCode += (int)theWord.charAt(i);
	    	}
	    	
	    	return HashCode;
	    }
	    
	    public static int countNumOccurrences(String theWord, SepChain theTable)
	    {
	    	//int theCount = 0;
	    	int hash = getHashCode(theWord);
	    	int tableKey = hash% theTable.getLength();
	    	
	    	return theTable.numOccurences(tableKey, hash);
	    	
	    	
	    	
	    }
	}


public class Program 
{
	
	private Node head;
	public Program()
	{
		head=null;
	}
	public class Node
	{
		public int data;
		public Node next;
		
		public Node (int data)
		{
			this.data=data;
			next= null;
		}
	}

	public void AddElem(int data)
	{
		Node newNode = new Node(data);
		Node currElem = head;
		
		if (head == null)
		{
			head = newNode;
		}
		else
		{
			while (currElem.next != null)
			{
				currElem = currElem.next;
			}
			currElem.next = newNode;
		}
	}
	public void DelElem(int data)
	{ Node currElem=head;
	  Node prevElem=null;
	  
	  while(currElem.next != null)
	  {
		  if(currElem.data == data)
		  {
		    if(currElem == head )
			  {
				  head = currElem.next;
			  }
		    else
		      {
			     prevElem.next = currElem.next;
		      } 
		  }
		  prevElem = currElem;
		  currElem = currElem.next;
	  }
		
	}
	public void Print()
	{
		Node currElem = head;
		
		//if(head !=null)
		//{
			//System.out.print(head.data);
			//System.out.print(" ");
		//}
		
		while(currElem != null)
		{
			//currElem = currElem.next;
			System.out.print(currElem.data);
			System.out.print(" ");
			currElem = currElem.next;
		}
	}
    public int TakeElem(int data)
    {
      Node currElem=head;
  	  Node prevElem=null;
  	  int elem=0;
  	  
  	  while(currElem.next != null)
  	  {
  		  if(currElem.data == data)
  		  {
  		    elem = currElem.data;
  		    if(currElem == head )
  			  {
  				  head = currElem.next;
  			  }
  		    else
  		      {
  			     prevElem.next = currElem.next;
  		      } 
  		  }
  		  prevElem = currElem;
  		  currElem = currElem.next;
  	  }
  	  
  	  return elem;
    }
    
}


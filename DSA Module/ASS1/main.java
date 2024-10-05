public class main{
	public static void main(String[]args){
     /*t x = 1, y=10;
	  do
	  {
		  if(x>y)
		  {
			  break;
		  }
		  y--;
	  }while(++x<5);
	  System.out.println("x=" + x + " and y = " + y);*/
	  
	  void deleteNode(int position)//1
{
	if(head == null)
		return;
	
	Node temp = head;
	//DEletion at the begining
	if(position == 0)
	{
		head = temp.next;// head position change
		return;
	}
	
	for(int i = 0; temp != null && i<position-1; i++)
	{
		temp = temp.next;
	}
	if(temp == null || temp.next == null)
		return;
	Node next = temp.next.next;
	temp.next = next;
}
	
	
}

	
	
}
}
}
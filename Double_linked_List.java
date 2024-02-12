public class D_LinkedList {
Node head;
Node tail;
 	
static  class Node{
	int data;
	Node next;
	Node prev;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}	





	static D_LinkedList insert(D_LinkedList list,int data)
	{
		Node node=new Node(data);
		
		
		if(list.head==null)
		{
			list.head=node;
			list.tail=node;
		}
		else
		{
			Node temp=list.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		
System.out.println(data+" is inserted");
		return list;
		
	}
	

	
	public void print(D_LinkedList list)
	{
		System.out.println("Printing Lines ...");
		Node temp=list.head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		D_LinkedList list = new D_LinkedList();
		list=list.insert(list, 10);
		list=list.insert(list, 20);
		list=list.insert(list, 30);
		list=list.insert(list, 40);
		list=list.insert(list, 50);

		list.print(list);
	}

}

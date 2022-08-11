import java.util.List;

// Java program for reversing the linked list

class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
static Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
public static void res(Node head){
    Node head2  = reverse(head);
    Node head3 = new Node(0);
    Node temp = head3;
    boolean flag = true;
    while(head !=null && head2 !=null){
          if(flag){
             temp.next=head2;
             head2=head2.next;
             System.out.println(temp.data+"  "+head2.data);
          }else{
                temp.next=head;
                head=head.next;
                System.out.println(temp.data+"  "+head.data);
          }
          if(flag){
              flag=false;
          }else{
              flag=true;
          }
          temp=temp.next;
    }
    printList(head3.next);
}
	// prints content of double linked list
static void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next= new Node(6);
		list.head.next.next.next.next.next.next= new Node(7);
		list.head.next.next.next.next.next.next.next= new Node(8);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
        res(head);
	}
}

// This code has been contributed by Mayank Jaiswal

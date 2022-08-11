import java.io.*;


class Node
{
	int data;
	Node next,prev;
}	
public class onesixthree {
 
// Funtion to add Node at the end of a
// Doubly LinkedList
static Node insertAtEnd(Node head,int data)
{
	Node new_node = new Node();
	new_node.data = data;
	new_node.next = null;
	Node temp = head;
	
	if (head == null)
	{
		new_node.prev = null;
		head = new_node;
		return head;
	}

	while (temp.next != null)
	{
		temp = temp.next;
	}
	temp.next = new_node;
	new_node.prev = temp;
	return head;
}

// Function to print Doubly LinkedList
static void printDLL(Node head)
{
	while (head != null)
	{
		System.out.print(head.data + " ");
		head = head.next;
	}
	System.out.println();
}

// Function to Reverse a doubly linked list
// in groups of given size
static Node reverseByN(Node head, int k)
{
	if (head == null)
		return null;
		
	head.prev = null;
	Node temp;
	Node curr = head;
	Node newHead = null;
	int count = 0;
	
	while (curr != null && count < k)
	{
		newHead = curr;
		temp = curr.prev;
		curr.prev = curr.next;
		curr.next = temp;
		curr = curr.prev;
		count++;
	}
	
	// Checking if the reversed LinkedList size is
	// equal to K or not. If it is not equal to k
	// that means we have reversed the last set of
	// size K and we don't need to call the
	// recursive function
	if (count >= k)
	{
		head.next = reverseByN(curr, k);
	}
	return newHead;
}

// Driver code
public static void main(String[] args)
{
	Node head = null;
	for(int i = 1; i <= 10; i++)
	{
		head = insertAtEnd(head, i);
	}
	
	printDLL(head);
	int n = 4;
	
	head = reverseByN(head, n);
	printDLL(head);
}
}

// This code is contributed by avanitrachhadiya2155

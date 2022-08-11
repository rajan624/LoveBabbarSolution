import java.util.HashSet;
import java.util.Set;

public class onefourthree {
static class Node
{
int key;
Node next;
};

static Node newNode(int key)
{
Node temp = new Node();
temp.key = key;
temp.next = null;
return temp;
}
static void printList(Node head)
{
while (head != null)
{
	System.out.print(head.key + " ");
	head = head.next;
}
System.out.println();
}
static Node detectAndRemoveLoop(Node head){

if (head == null || head.next == null)
	return null;
Node slow = head, fast = head;
slow = slow.next;
fast = fast.next.next;
while (fast != null &&
		fast.next != null)
{
	if (slow == fast)
	break;
	slow = slow.next;
	fast = fast.next.next;
}
if (slow != fast)
	return null;

slow = head;
while (slow != fast)
{
	slow = slow.next;
	fast = fast.next;
}

return slow;
}
static Node detectLoop(Node head)
{
    Node temp = new Node();
    while (head != null)
    {
        if (head.next == null)
        {
            return null;
        }
        if (head.next == temp)
        {
            break;
        }
        Node nex = head.next;
        head.next = temp;
        head = nex;
    }
 
    return head;
}
static Node detectCycle(Node A) {
    Set<Node> uset = new HashSet<Node>();
    Node ptr = A;
    while (ptr != null)
    {
      if(uset.contains(ptr))
      {
        return ptr;
      }
      else
      {
        uset.add(ptr);
      }
      ptr = ptr.next;
    }
    return null;
  }
public static void main(String[] args)
{
Node head = newNode(50);
head.next = newNode(20);
head.next.next = newNode(15);
head.next.next.next = newNode(4);
head.next.next.next.next = newNode(10);

// Create a loop for testing
head.next.next.next.next.next = head.next.next;

Node res = detectAndRemoveLoop(head);
if (res == null)
	System.out.print("Loop does not exist");
else
	System.out.print("Loop starting node is " + res.key);
}
}    

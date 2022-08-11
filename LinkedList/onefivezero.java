import java.util.Scanner;

public class onefivezero {
    class Node{
        int data;
        Node next;
        public Node(){
            this.data=0;
            this.next=null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
 
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int length(){
        int i=0;
        Node temp= head;
        while (temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
   }
 static  int intersectPoint(Node head1, Node head2)
	{
	  if(head1==null || head2==null){
      return -1; 
   } 
Node a=head1;
Node b=head2;
while(a!=b)
{
a=a==null?head2:a.next;
b=b==null?head1:b.next;
}
return a.data;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        onefivezero sList = new onefivezero();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();
       }
        onefivezero list = new onefivezero();
       i=1;
      while (i!=0){
          System.out.println("Enter the data");
          sList.addNode(scan.nextInt());
          System.out.println("are you continue then input 1 else 0");
          i=scan.nextInt();
      }
   
    
        System.out.println(intersectPoint(sList.head, list.head));
    }
}

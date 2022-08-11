import java.util.Scanner;


public class LinkedList {
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
    public Node reverse( ){
        Node nextnode, prevnode,currentnode;
        prevnode=null;
        currentnode=head;
        nextnode=head;
        while (nextnode!=null){
            nextnode=nextnode.next;
            currentnode.next=prevnode;
            prevnode=currentnode;
            currentnode=nextnode;

        }
        head=prevnode;
        return head;
    }
    Node reverseUtil(Node curr, Node prev){
        if (head == null)
            return head;
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return head;
        }
        Node next1 = curr.next;
        curr.next = prev;
        reverseUtil(next1, curr);
        return head;
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
   public void res(Node head){
       Node head1 = head.reverse();
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList sList = new LinkedList();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();
       }
        sList.display();
      sList.reverse();
       
    }
}
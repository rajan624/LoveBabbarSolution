import java.util.Scanner;

public class onesixeight {
    void copyList(Node head) {
        // your code here
        Node curr = head;
while (curr != null) {
Node next = curr.next;
curr.next = new Node(curr.data);
curr.next.next = next;
curr = next;
}

curr = head;
while (curr != null) {
curr.next.arb = curr.arb != null ? curr.arb.next : null;
curr = curr.next.next;
}

Node newHead = new Node(0), copyCurr = newHead;
curr = head;
while(curr != null) {
copyCurr.next = curr.next;
curr.next = copyCurr.next.next;
curr = curr.next;
copyCurr = copyCurr.next;
}

display(newHead.next); 
    }
    class Node{
        int data;
        Node next,arb;
        public Node(){
            this.data=0;
            this.next=arb=null;
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
 
 static public void display(Node head) {
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


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        onesixeight sList = new onesixeight();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();       
}
sList.copyList(sList.head);

}

}

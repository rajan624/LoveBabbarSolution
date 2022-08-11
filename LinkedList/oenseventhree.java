import java.util.Scanner;
public class oenseventhree {
     //Function to find the data of nth node from the end of a linked list.
static  int getNthFromLast(Node head, int n)
     {
         // Your code here	
         Node temp= head;
         int length=0;
         while(temp!=null){
             length++;
             temp=temp.next;
         }
         if(length<n){
             return -1;
         }
         temp=head;
         for(int i=0;i<(length)-n;i++){
            temp=temp.next;
         }
         return temp.data;
     }



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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        oenseventhree sList = new oenseventhree();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();
       }
       System.out.println("enter the value of n");
       int n = scan.nextInt();
       System.out.println(getNthFromLast(sList.head, n));
       
        }
}

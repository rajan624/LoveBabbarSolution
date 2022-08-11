import java.util.Scanner;

import javax.swing.plaf.SliderUI;
public class onesixseven {
    
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
 
  static  public void display(Node head) {
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
   static void segregate(Node head)
    {
        // add your code here]
    int [] arr={0,0,0};
    Node temp = head;
    while(temp!=null){
        if(temp.data==0){
            arr[0]++;
            temp=temp.next;
        }
        else if(temp.data==1){
            arr[1]++;
            temp=temp.next;
        }
        else{
            arr[2]++;
            temp=temp.next;
        }
    }
    Node temp1= head;
    while(temp1!=null){
        if(arr[0]!=0){
            temp1.data=0;
            arr[0]--;
            temp1=temp1.next;
        }
        else if(arr[1]!=0){
            temp1.data=1;
            arr[1]--;
            temp1=temp1.next;
        }
        else{
            temp1.data=2;
            temp1=temp1.next;
        }
    }
 display(head);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        onesixseven sList = new onesixseven();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();
       }
        segregate(sList.head);
       
    }
}


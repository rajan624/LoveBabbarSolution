import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class onefourtwo {
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
        public static void removeLoop(Node head){
            // code here
            // remove the loop without losing any nodes
    Set<Node> set=new HashSet<>();
    Node temp=head;
    while(temp!=null){
    
    if(set.contains(temp.next)){
    
    temp.next=null;
    return;
    
    }
    
    set.add(temp);
    temp=temp.next;
    
    }
    return ;
        }
        public static void removeLoop1(Node head){
            // code here
            // remove the loop without losing any nodes
            Node high = head;
            Node low=head;
            while(true){
                try{
                high=high.next.next;
                low= low.next;
                if(low==high){
                    break;
                }
                }
                catch(Exception e){
                    break;
                }
            }
            if(low==head){
                while(head.next!=low){
                    head=head.next;
                }
                head.next=null;
            }
            else if(low==high){
                low=head;
                while(high.next!=low.next){
                    high=high.next;
                    low=low.next;
                }
                high.next=null;
            }
            
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            onefourtwo sList = new onefourtwo();
            int i=1;
           while (i!=0){
               System.out.println("Enter the data");
               sList.addNode(scan.nextInt());
               System.out.println("are you continue then input 1 else 0");
               i=scan.nextInt();
           }
           System.out.println("enter the value of k");
           int k = scan.nextInt();
        removeLoop(sList.head);
        removeLoop1(sList.head);

          sList.display();
            
        }
    }



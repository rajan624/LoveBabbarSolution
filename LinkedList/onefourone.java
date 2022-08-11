import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class onefourone {
   
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
        public boolean hasmapsoln(Node head ){
            HashSet<Node> hs = new HashSet<>();
            Node temp = head;
            while(temp!=null){
                if(hs.contains(temp)){
                    return true;
                }
                hs.add(temp);
                temp=temp.next;
            }
            return false;

        }
        public boolean soln(Node head){
            Node slow = head;
            Node fast = head;
            while(true){
                try {
                    fast=fast.next.next;
                    slow= slow.next;
                } catch (Exception e) {
                    return false;
                }
                if(slow.equals(fast)){
                    return true;
                }
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            onefourone sList = new onefourone();
            int i=1;
           while (i!=0){
               System.out.println("Enter the data");
               sList.addNode(scan.nextInt());
               System.out.println("are you continue then input 1 else 0");
               i=scan.nextInt();
           }
           System.out.println("enter the value of k");
           int k = scan.nextInt();
           System.out.println(sList.hasmapsoln(sList.head));
           System.out.println(sList.soln(sList.head));
          sList.display();
            
        }
    }



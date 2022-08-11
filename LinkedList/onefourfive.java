import java.util.HashSet;
import java.util.Scanner;

public class onefourfive {
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
           static public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> hs = new HashSet<Integer>();
         Node temp = head;
         Node temp1=null;
         while(temp!=null){
             if(hs.contains(temp.data)){
                temp1.next=temp.next;
             }
             else{
             hs.add(temp.data);
             temp1=temp;
         }
         temp=temp.next;
         
         }
         return head;
    }
            
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                onefourfive sList = new onefourfive();
                int i=1;
               while (i!=0){
                   System.out.println("Enter the data");
                   sList.addNode(scan.nextInt());
                   System.out.println("are you continue then input 1 else 0");
                   i=scan.nextInt();
               }
               sList.head = removeDuplicates(sList.head);
              sList.display();
                
            }
        }
    
    
    


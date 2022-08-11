import java.util.Scanner;


public class onefourzero {
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
        public static Node reverse(Node node, int k)
        {
            //Your code here
            Node cur = node ;
            Node prev =null;
            Node nex =node;
            int c=0;
            while(nex!=null&&c<k){
                nex= nex.next;
                cur.next=prev;
                prev=cur;
                cur=nex;
                c++;
            }
            if(nex!=null){
                node.next=reverse(nex,k);
            }
            return prev;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            onefourzero sList = new onefourzero();
            int i=1;
           while (i!=0){
               System.out.println("Enter the data");
               sList.addNode(scan.nextInt());
               System.out.println("are you continue then input 1 else 0");
               i=scan.nextInt();
           }
           System.out.println("enter the value of k");
           int k = scan.nextInt();
          sList.head= reverse(sList.head, k);
          sList.display();
            
        }
    }

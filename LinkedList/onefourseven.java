import java.util.Scanner;

public class onefourseven {
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
        static Node reverse(Node head){
            Node cur=head;
            Node prev =null;
            Node nex= head;
            while(nex!=null){
                nex=cur.next;
                cur.next=prev;
                prev=cur;
                cur=nex;
                
            }
            return prev;
        }
        
        public static Node naddOne(Node head) 
        { 
            //code here.
            head=reverse(head);
            boolean f = true;
            Node cur = head;
            while(cur!=null&&f==true){
                if(cur.next==null && cur.data==9){
                    cur.data=1;
                    Node temp=null;
                    temp.next=head;
                    head=temp;
                    cur=cur.next;
                }
                else if(cur.data==9){
                    cur.data=0;
                    cur=cur.next;
                }
                else{
                    cur.data=cur.data+1;
                    cur=cur.next;
                    f=false;
                }
            }
            head=reverse(head);
            return head;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            onefourseven sList = new onefourseven();
            int i=1;
           while (i!=0){
               System.out.println("Enter the data");
               sList.addNode(scan.nextInt());
               System.out.println("are you continue then input 1 else 0");
               i=scan.nextInt();
           }
           System.out.println("enter the value of k");
           sList.head=naddOne(sList.head);
          sList.display();
            
        }
    }

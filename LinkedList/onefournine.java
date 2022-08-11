import java.util.Scanner;

public class onefournine {
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
        static    public void display(Node head) {
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
            public static void findIntersection(Node head1, Node head2)
            {
                // code here.
                onefournine hs = new onefournine();
                Node head3 =  hs.new Node(0);
                Node cur =head3;
                Node temp1=head1;
                Node temp2=head2;
                while(temp1!=null&&temp2!=null){
                    if(temp1.data<temp2.data){
                        temp1=temp1.next;
                    }
                    else if(temp1.data>temp2.data){
                        temp2=temp2.next;
                    }
                    else if(cur.data==0){
                        head3.data=temp1.data;
                        temp1=temp1.next;
                        temp2=temp2.next;
                    }
                    else{
                        Node temp = hs.new Node(temp1.data);
                        cur.next=temp;
                        cur=cur.next;
                        temp1=temp1.next;
                        temp2=temp2.next;
                    }
                }
             display(head3);
            }
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                onefournine sList = new onefournine();
                int i=1;
               while (i!=0){
                   System.out.println("Enter the data");
                   sList.addNode(scan.nextInt());
                   System.out.println("are you continue then input 1 else 0");
                   i=scan.nextInt();
               }
               onefournine list = new onefournine();
                int j=1;
               while (j!=0){
                   System.out.println("Enter the data");
                   list.addNode(scan.nextInt());
                   System.out.println("are you continue then input 1 else 0");
                   j=scan.nextInt();
               }
               findIntersection(sList.head, list.head);
              
            }
        }
        


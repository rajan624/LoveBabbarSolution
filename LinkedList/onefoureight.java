import java.util.Scanner;

public class onefoureight {
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
        static Node addTwoLists(Node first, Node second){
            // code here
            // return head of sum list
            onefoureight hs = new onefoureight();
         Node hea = hs.new Node(0);
    Node a = reverse(first);
    Node b = reverse(second);
    int carry = 0;
    Node curr = hea;
    while(a != null || b != null) {
    int n1 = (a==null) ? 0 : a.data;
    int n2 = (b==null) ? 0 : b.data;
    int sum = n1 + n2 + carry;
    carry = (sum > 9) ? 1 : 0;
    sum %= 10;
    curr.next = hs.new Node(sum);
    curr = curr.next;
    a = (a==null) ? a : a.next;
    b = (b==null) ? b : b.next;
    }
    
    if(carry == 1)
    curr.next = hs.new Node(1);
    
    
    Node finalHead = reverse(hea.next);
    return finalHead;
    }
    
    static Node reverse(Node head) {
    Node curr = head;
    Node prev = null, next = null;
    while(curr != null) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
    }
    return prev;
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            onefoureight sList = new onefoureight();
            int i=1;
           while (i!=0){
               System.out.println("Enter the data");
               sList.addNode(scan.nextInt());
               System.out.println("are you continue then input 1 else 0");
               i=scan.nextInt();
           }
           onefoureight List = new onefoureight();
           int j=1;
          while (j!=0){
              System.out.println("Enter the data");
              sList.addNode(scan.nextInt());
              System.out.println("are you continue then input 1 else 0");
              j=scan.nextInt();
          }
          onefoureight list = new onefoureight();
           list.head=addTwoLists(List.head,sList.head);
          sList.display();
            
        }
    }

import java.util.Scanner;

public class onefourfour {   
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
 static Node removeDuplicates(Node head)
    {
	if(head==null){
	    return null;
	}
	Node temp = head;
	while(temp.next!=null){
	    if(temp.data==temp.next.data){
	        temp.next=temp.next.next;
	    }
	    else{
	    temp=temp.next;
	    }
	}
	 return head;
	
    }
        
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            onefourfour sList = new onefourfour();
            int i=1;
           while (i!=0){
               System.out.println("Enter the data");
               sList.addNode(scan.nextInt());
               System.out.println("are you continue then input 1 else 0");
               i=scan.nextInt();
           }
           System.out.println("enter the value of k");
           int k = scan.nextInt();
           sList.head = removeDuplicates(sList.head);
          sList.display();
            
        }
    }





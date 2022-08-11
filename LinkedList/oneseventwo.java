import java.util.Scanner;
public class oneseventwo {
   
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
 
 static public void display(Node head) {
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
  static void divide( Node head){
    // code here
   Node cur = head;
   Node ehead=null;
   Node ohead=null;
   Node etemp=null;
   Node otemp=null;
   while(cur!=null){
       if(cur.data%2==0){
           if(ehead==null){
               ehead=cur;
                etemp=ehead;
           }
           else{
               etemp.next=cur;
               etemp=cur;
           }
       }
       else{
        if(ohead==null){
            ohead=cur;
             otemp=ohead;
        }
        else{
            otemp.next=cur;
            otemp=cur;
        }
       }
       cur=cur.next;
   }
   if(ehead==null||ohead==null)
   return ;
 etemp.next=ohead;
 otemp.next=null;
  display(ehead);

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        oneseventwo sList = new oneseventwo();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();
       }
       divide(sList.head);
        
}
}

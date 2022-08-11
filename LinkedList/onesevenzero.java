import java.util.Scanner;

public class onesevenzero {
   static public void multiplyTwoLists(Node l1,Node l2){
        String m1 = "";
        String m2 = "";
        while(l1!=null)
        {
        m1 = m1 + String.valueOf(l1.data);
        l1 = l1.next;
        }
        while(l2!=null)
        {
        m2 = m2 + String.valueOf(l2.data);
        l2 = l2.next;
        }
        java.math.BigInteger m11 = new java.math.BigInteger(m1);
        java.math.BigInteger m22 = new java.math.BigInteger(m2);
        java.math.BigInteger mul = m11.multiply(m22);
        java.math.BigInteger modd = new java.math.BigInteger("1000000007");
        java.math.BigInteger res = mul.mod(modd);
        Long rs = res.longValue();
System.out.println(rs);
           }
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
                // your code here
        if(head==null && head.next==null){
        return  ;
        }
        
        Node temp=head;
        Node pre=null;
        while(temp!=null && temp.next!=null){
        if(temp.data<temp.next.data){
        pre=temp.next;
        temp.data=pre.data;
        temp.next=pre.next;
        temp=head;
        }
        else{
        temp=temp.next;
        
            }
        }
  display(head);

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        onesevenzero sList = new onesevenzero();
        int i=1;
       while (i!=0){
           System.out.println("Enter the data");
           sList.addNode(scan.nextInt());
           System.out.println("are you continue then input 1 else 0");
           i=scan.nextInt();
       }
       
        
       onesevenzero sit = new onesevenzero();
     i=1;
      while (i!=0){
          System.out.println("Enter the data");
          sit.addNode(scan.nextInt());
          System.out.println("are you continue then input 1 else 0");
          i=scan.nextInt();
      }
multiplyTwoLists(sList.head,sit.head);      
       
}

}

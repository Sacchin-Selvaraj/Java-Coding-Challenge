package DSA;
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoubleLinkedList {

    public static void main(String[] args) {

        int[] arr={2,4,6,8,10,12};
        Node list=insertIntoList(arr);
        displayLinkedList(list);
        list=deleteHead(list);
        displayLinkedList(list);
        deleteTail(list);
        addInLinkedList(15,list);
        deleteFromMiddle(3,list);
        displayLinkedList(list);

    }

    private static void deleteFromMiddle(int k, Node list) {
        if (list==null || list.next==null){
            return;
        }
        Node temp=list;
        int count=0;
        while (count!=k && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if (count!=k){
            System.out.println("K is Invalid");
            return;
        }
        Node back=temp.prev;
        Node front=temp.next;
        if (temp.prev==null && temp.next!=null){
            deleteHead(list);
        }else if (temp.next==null && temp.prev!=null){
            deleteTail(list);
        }else {
            back.next=front;
            front.prev=back;
            temp.next=null;
            temp.prev=null;
        }
    }

    private static void addInLinkedList(int num,Node list) {
        Node tail=list;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node temp=new Node(num,null,tail);
        tail.next=temp;
    }

    private static void deleteTail(Node list) {

        Node tail=list;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.prev;
        prev.next=null;
        tail.prev=null;
    }

    private static Node deleteHead(Node list) {
        if (list==null || list.next==null){
            return null;
        }
        Node prev=list;
        list=list.next;
        list.prev=null;
        prev.next=null;
        return list;
    }

    private static void displayLinkedList(Node list) {

        while (list!=null){
            System.out.print(list.data+" ");
            list=list.next;
        }
        System.out.println();
    }


    private static Node insertIntoList(int[] arr) {
        Node head=new Node(arr[0]);
        Node prevs=head;

        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i],null,prevs);
            prevs.next=temp;
            prevs=temp;
        }
        return head;
    }
}

package DSA;

public class ReorderLinkedList {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        LinkedListDemo list=new LinkedListDemo();

        for(int num:arr){
            list.add(num);
        }

        LinkedListDemo.Node head=list.head;

        list.print(head);

        list.print(list.reorder(head));
    }
}
class LinkedListDemo{

    Node head=null;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
            this.next=null;
        }

    }

    public void add(int data){

        Node current = head;
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next = newNode;
        }

    }

    public void print(Node printNode){
        if(printNode==null){
            System.out.println("No Integer to print");
        }

        while(printNode!=null){
            System.out.print(printNode.value+(printNode.next==null?" ":","));
            printNode=printNode.next;
        }
        System.out.println();
    }

    public Node reorder(Node reorderNode){

        Node newHead=reorderNode;
        Node slow = reorderNode;
        Node fast = reorderNode;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        fast=slow.next;
        slow.next=null;

        Node second = reverse(fast);

        print(newHead);
        print(second);

        Node mainHead = newHead;

        while(second!=null){

            Node firstNext=newHead.next;
            Node secondNext=second.next;

            newHead.next=second;
            second.next=firstNext;

            newHead=firstNext;
            second=secondNext;
        }

        return mainHead;

    }

    public Node reverse(Node rev){
        Node prev=null;
        Node curr = rev;
        Node nextNode=null;

        while(curr!=null){
            nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        }

        return prev;
    }
}
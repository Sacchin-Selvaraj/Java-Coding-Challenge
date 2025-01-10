package Java_Program;

import java.util.Scanner;

public class LinkedList {

    Node head=null;

    class Node{
        int data;
        Node next=null;

        public Node(int data){
            this.data=data;
            next=null;

        }
    }

    public void addElement(int data){
        Node newNode=new Node(data);
        Node current=head;
        if(head==null)
            head=newNode;
        else{
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

    }

    public void addFirst(int data){

        Node newNode=new Node(data);

        Node current=head;
        head=newNode;
        newNode.next=current;
    }

    public void deleteElement(int data){

        Node current=head;

        while (current.next!=null &&current.next.data!=data){
            current=current.next;
        }
        if(current.next!=null)
            current.next=current.next.next;

    }

    private void reverseList() {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }

    private void insertElement(int data,int afterData) {

        Node newNode=new Node(data);
        Node current=head;
        Node temp=null;

        while (current!=null&&current.data!=afterData){

            current=current.next;
        }
        temp=current.next;
        current.next=newNode;
        newNode.next=temp;

        printList();

    }

    public void printList(){

        Node current = head;
        while (current != null) { // Fixed condition
            System.out.print(current.data + (current.next != null ? "," : "")); // Improved print
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Digits : ");
        int k=sc.nextInt();
        LinkedList obj=new LinkedList();

        for (int i = 0; i < k; i++) {
            obj.addElement(sc.nextInt());
        }

        obj.addFirst(1);

        obj.printList();

        System.out.println("Enter the number to delete : ");
        int del=sc.nextInt();

        obj.deleteElement(del);

        obj.printList();

        System.out.println("Enter the element need to insert :");
        int insert=sc.nextInt();
        int insertAfter=sc.nextInt();

        obj.insertElement(insert,insertAfter);

        obj.reverseList();
        System.out.println("After reversing the linked list");
        obj.printList();
    }
}

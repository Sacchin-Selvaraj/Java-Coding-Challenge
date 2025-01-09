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

    public void addFirst(){


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

        obj.printList();
    }
}

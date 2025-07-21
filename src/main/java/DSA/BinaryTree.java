package DSA;
import java.util.Scanner;

public class BinaryTree {

    Node root=null;

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }
    private void addElement(int data) {

        root=addElementRec(root,data);

    }
    private Node addElementRec(Node root, int data) {

        if(root==null)
            root=new Node(data);
        else if(data < root.data)
            root.left=addElementRec(root.left,data);
        else if(data > root.data)
            root.right=addElementRec(root.right,data);

       return root;
    }
    private void inOrder() {

        inOrderRec(root);

    }
    private void inOrderRec(Node root) {

        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }

    }
    private void preOrder() {

        preOrderRec(root);

    }
    private void preOrderRec(Node root) {

        if(root!=null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Digits : ");
        int k = sc.nextInt();
        BinaryTree obj = new BinaryTree();

        for (int i = 0; i < k; i++) {
            obj.addElement(sc.nextInt());
        }
        System.out.println("InOrder Traversal :");
        obj.inOrder();
        System.out.println();

        System.out.println("PreOrder Traversal :");
        obj.preOrder();
    }
}

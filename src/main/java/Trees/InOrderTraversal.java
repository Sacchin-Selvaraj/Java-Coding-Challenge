package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InOrder{

    Node root=null;
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int data) {
            this.val = data;
        }
    }
    public Node addElement(Node root,int data){
        if (root==null){
            root=new Node(data);
        } else if (data<root.val) {
            root.left=addElement(root.left,data);
        } else if (data> root.val) {
            root.right=addElement(root.right,data);
        }

        return root;
    }
    public void InOrderTraversal(Node root){
        if (root==null)
            return;
        InOrderTraversal(root.left);
        System.out.print(root.val);
        InOrderTraversal(root.right);
    }

    //LeetCode
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> list=new ArrayList<>();
        InOrderTraversal(root,list);
        return list;
    }
    public void InOrderTraversal(Node root, List<Integer> list){
        if (root==null)
            return;
        InOrderTraversal(root.left,list);
        list.add(root.val);
        InOrderTraversal(root.right,list);
    }
}

public class InOrderTraversal {

    public static void main(String[] args) {
        InOrder obj=new InOrder();
        System.out.println("Enter the Number of Elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        InOrder.Node root = obj.root;
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            root=obj.addElement(root,num);
        }
       // obj.InOrderTraversal(root);
        System.out.println(obj.inorderTraversal(root));
    }
}
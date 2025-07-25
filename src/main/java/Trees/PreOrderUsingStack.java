package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class PreOrder{

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
    public List<Integer> PreOrderStack(Node node){
        List<Integer> list=new ArrayList<>();
        if (node==null) return list;
        Stack<Node> stack=new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            Node pair=stack.pop();
            list.add(pair.val);
            if (pair.right!=null){
                stack.push(pair.right);
            }
            if (pair.left!=null){
                stack.push(pair.left);
            }
        }
        return list;
    }

    public List<Integer> InorderStack(Node node){
        List<Integer> list=new ArrayList<>();
        if (node==null) return list;
        Stack<Node> stack=new Stack<>();

        while ( root!=null || !stack.isEmpty()){
           while (root!=null){
               stack.push(root);
               root=root.left;
           }
           root=stack.pop();
           list.add(root.val);
           root=root.right;
        }
        return list;
    }
}
public class PreOrderUsingStack {

    public static void main(String[] args) {
        PreOrder obj=new PreOrder();
        System.out.println("Enter the Number of Elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PreOrder.Node root = obj.root;
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            root=obj.addElement(root,num);
        }
        // obj.InOrderTraversal(root);
        System.out.println(obj.PreOrderStack(root));
    }
}

package Trees;

import java.util.*;

class LevelOrder{

    LevelOrder.Node root=null;
    static class Node{
        int val;
        LevelOrder.Node left;
        LevelOrder.Node right;

        public Node(int data) {
            this.val = data;
        }
    }
    public LevelOrder.Node addElement(LevelOrder.Node root, int data){
        if (root==null){
            root=new LevelOrder.Node(data);
        } else if (data<root.val) {
            root.left=addElement(root.left,data);
        } else if (data>=root.val) {
            root.right=addElement(root.right,data);
        }
        return root;
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> queue=new ArrayDeque<>();
        if (root==null)
            return list;
        queue.add(root);
        while (!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> res=new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                Node pair=queue.poll();
                if (pair.left!=null) queue.add(pair.left);
                if (pair.right!=null) queue.add(pair.right);
                res.add(pair.val);
            }
            list.add(res);
        }
        return list;
    }

}

public class LevelOrderTraversal {

    public static void main(String[] args) {
        LevelOrder obj=new LevelOrder();
        System.out.println("Enter the Number of Elements : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LevelOrder.Node root = obj.root;
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            root=obj.addElement(root,num);
        }
        // obj.InOrderTraversal(root);
        System.out.println(obj.levelOrder(root));
    }
}

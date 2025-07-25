package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }
    public TreeNode insertBinaryTree(Integer[] nums){
        if (nums==null || nums.length==0)
            return null;
        TreeNode node=new TreeNode(nums[0]);
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(node);
        int i=0;
        while (!queue.isEmpty() && i<nums.length){
           node=queue.poll();
            if (i<nums.length && nums[i]!=null){
                node.left=new TreeNode(nums[i]);
                queue.add(node.left);
            }
            i++;
            if (i<nums.length && nums[i]!=null){
                node.right=new TreeNode(nums[i]);
                queue.add(node.right);
            }
            i++;
        }
        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Integer[] nums={-10,9,20,null,null,15,7};
        TreeNode rootNode=tree.insertBinaryTree(nums);

    }
}

package Trees;


import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class TreeNodes{
    TreeNode node;
    int line;

    public TreeNodes(TreeNode node, int line) {
        this.node = node;
        this.line = line;
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
        int i=1;
        while (!queue.isEmpty() && i<nums.length){
           TreeNode current=queue.poll();
            if (nums[i]!=null){
                current.left=new TreeNode(nums[i]);
                queue.add(current.left);
            }
            i++;
            if (i<nums.length && nums[i]!=null){
                current.right=new TreeNode(nums[i]);
                queue.add(current.right);
            }
            i++;
        }
        return node;
    }
    public void inOrder(TreeNode node){
        if (node==null)
            return;
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Integer[] nums={1,2,3,4,5,6,7,null,null,8,9};
        TreeNode rootNode=tree.insertBinaryTree(nums);
        tree.inOrder(rootNode);
        System.out.println("\nMaximum Path Sum : "+tree.maximumPathSum(rootNode));
        System.out.println("Min Depth : "+tree.minDepth(rootNode));
        System.out.println("Bottom View : ");
        for (Integer list:findBottomView(rootNode)){
            System.out.print(" "+list);
        }
        System.out.println("\nRight View : ");
        for (Integer list:rightSideView(rootNode)){
            System.out.print(" "+list);
        }
    }

    private static List<Integer> findBottomView(TreeNode rootNode) {
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<TreeNodes> queue=new ArrayDeque<>();
        queue.add(new TreeNodes(rootNode,0));
        while (!queue.isEmpty()){
            TreeNodes node=queue.poll();
            int line=node.line;
            map.put(line,node.node.val);
            if (node.node.left!=null){
                queue.add(new TreeNodes(node.node.left,line-1));
            }
            if (node.node.right!=null){
                queue.add(new TreeNodes(node.node.right,line+1));
            }
        }
        return new ArrayList<>(map.values());
    }

    public int maximumPathSum(TreeNode node){
        if(node==null) return 0;
        int[] max={node.val};
        findMaximumPathSum(node,max);
        return max[0];
    }

    private int findMaximumPathSum(TreeNode node, int[] max) {
        if (node==null)
            return 0;
        int left=Math.max(findMaximumPathSum(node.left,max),0);
        int right=Math.max(findMaximumPathSum(node.right,max),0);
        max[0]=Math.max(max[0],node.val+(left+right));
        return Math.max(left,right)+node.val;
    }

    public int minDepth(TreeNode root) {
        int[] min=new int[1];
        min[0]=Integer.MAX_VALUE;
        int depth=1;
        findMinDepth(root,min,depth);
        return min[0]==Integer.MAX_VALUE?0:min[0];
    }

    private void findMinDepth(TreeNode root, int[] min, int depth) {
        if (root==null){
            return;
        }
        if (root.left==null && root.right==null){
            min[0]=Math.min(min[0],depth);
        }
        findMinDepth(root.left,min,depth+1);
        findMinDepth(root.right,min,depth+1);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if (root==null)
            return list;
        queue.add(root);
        while (!queue.isEmpty()){
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                if (i==0) list.add(node.val);
                if (node.right!=null){
                    queue.add(node.right);
                }
                if (node.left!=null){
                    queue.add(node.left);
                }
            }
        }
        return list;
    }
}

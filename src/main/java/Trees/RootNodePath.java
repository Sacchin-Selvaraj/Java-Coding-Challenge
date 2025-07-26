package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode2{
    int val;
    TreeNode2 left;
    TreeNode2 right;

    public TreeNode2(int val) {
        this.val = val;
    }
}

public class RootNodePath {



    public static TreeNode2 insertIntotree(Integer[] nums){
        if (nums.length==0)
            return null;
        Queue<TreeNode2> queue=new ArrayDeque<>();
        TreeNode2 root=new TreeNode2(nums[0]);
        queue.add(root);
        int i=1;
        while (!queue.isEmpty() && i<nums.length){
            TreeNode2 pair=queue.poll();
            if (nums[i]!=null){
                pair.left=new TreeNode2(nums[i]);
                queue.add(pair.left);
            }
            i++;
            if (i<nums.length && nums[i]!=null){
                pair.right=new TreeNode2(nums[i]);
                queue.add(pair.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] nums={1,2,3,4,5,null,null,null,null,6,7};
        TreeNode2 rootNode=insertIntotree(nums);
        int targetNode=7;
        System.out.println(findRootNodePath(rootNode,targetNode));
    }

    private static List<Integer> findRootNodePath(TreeNode2 root, int targetNode) {
        List<Integer> list=new ArrayList<>();
        rootToNodePath(list,root,targetNode);
        return list;
    }

    private static boolean rootToNodePath(List<Integer> list, TreeNode2 root, int targetNode) {
        if (root==null)
            return false;
        list.add(root.val);
        if (rootToNodePath(list,root.left,targetNode))
            return true;
        if ( rootToNodePath(list,root.right,targetNode))
            return true;

        if (list.getLast()==targetNode)
            return true;
        else{
            list.removeLast();
            return false;
        }
    }
}

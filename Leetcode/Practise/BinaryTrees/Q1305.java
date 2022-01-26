package Practise.BinaryTrees;
//1305. All Elements in Two Binary Search Trees
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Q1305 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    public void dfs(TreeNode root,List<Integer> arr){
        if(root != null) {
            arr.add(root.val);
            if(root.left != null)
                dfs(root.left,arr);
            if(root.right != null)
                dfs(root.right,arr);
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> lst = new ArrayList<>();
        dfs(root1,lst);
        dfs(root2,lst);
        Collections.sort(lst);
        return lst;
    }
}

/*

Given the root of a binary tree,
return the preorder traversal of its nodes' values.



Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:


Input: root = [1,2]
Output: [1,2]
Example 5:


Input: root = [1,null,2]
Output: [1,2]


Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively?
 */

import java.util.ArrayList;
import java.util.List;

//public class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(){};
//    TreeNode(int val) {this.val = val;}
//    TreeNode(int val,TreeNode left, TreeNode right){
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}

/*
Solution:
Preorder: root, left, right sequence
1. print/add root value
2. recurse root.left
3. recurse root.right

三叉树：
root.left
root.mid
root.right

 */

public class Q144_Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    public void helper(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        res.add(root.val);
        //如果是打印
//        System.out.println(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
}

/*
        5

      /   \

     9     12

   /  \      \

  2    3      14

The lowest common ancestor of 2 and 14 is 5

The lowest common ancestor of 2 and 9 is 9

The lowest common ancestor of 2 and 8 is null (8 is not in the tree)
 */
public class LowestCommonAncestorII {
    public TreeNode LCAII(TreeNode root, TreeNode one, TreeNode two){

    }

    public static void main(String[] args){
        LowestCommonAncestorII s = new LowestCommonAncestorII();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(9);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(14);
        TreeNode result = s.LCAII(root, new TreeNode(2),new TreeNode(14));
        System.out.println(result);


    }
}

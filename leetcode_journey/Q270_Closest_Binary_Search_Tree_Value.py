"""
Given a non-empty binary search tree and a target value, 
find the value in the BST that is closest to the target.

Note:

Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.
Example:

Input: root = [4,2,5,1,3], target = 3.714286

    4
   / \
  2   5
 / \
1   3

Output: 4
"""
class Solution(object):
    def cloesetValue(self, root, target):
        """
        
        :param root: TreeNode
        :param target: float
        :return: int
        """
        lst = []
        def inorder(root):
            if root:
                inorder(root.left)
                lst.append(root.val)
                inorder(root.right)

        inorder(root)
        close = lst[0]
        diff = abs(target - lst[0])
        for i in lst:
            if abs(target - i) < diff:
                close = i
                diff = abs(target - i)
        return close

class newnode:

    # Constructor to create a new node
    def __init__(self, data):
        self.val = data
        self.left = None
        self.right = None


# Driver Code
if __name__ == '__main__':
    root = newnode(9)
    root.left = newnode(4)
    root.right = newnode(17)
    root.left.left = newnode(3)
    root.left.right = newnode(6)
    root.left.right.left = newnode(5)
    root.left.right.right = newnode(7)
    root.right.right = newnode(22)
    root.right.right.left = newnode(20)
    k = 18
    print(Solution().cloesetValue(root,k))
"""
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:


Need to work on the below task:
Coud you solve it without converting the integer to a string?
"""



class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        if str(x) == str(x)[::-1]:
            return True
        else:
            return False

if __name__ == "__main__":
    n = 1231
    print (n)
    print (Solution().isPalindrome(n))
    n2 = 121
    print (n2)
    print (Solution().isPalindrome(n2))
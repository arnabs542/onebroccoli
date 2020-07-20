"""
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 

Constraints:

s consists only of printable ASCII characters.
"""

class Solution(object):
    def isPalindrome(self,s):
        """
        
        :param s: str
        :return: True or False
        """

        """
        we start traversing inwards, from both ends of the input string, 
        should expect to see the same characters 
        set two pointers left and right, at both side of the string
        if condition is not met at any time, break and return early
        We can simply ignore non-alphanumeric characters by continuing to traverse further.
        continue traversing inwards until the pointers meet in the middle
        """
        l, r = 0, len(s)-1
        while l < r:
            while l < r and not s[l].isalnum():
                l += 1
            while l < r and not s[r].isalnum():
                r -= 1
            if l < r and s[l].lower() != s[r].lower():
                return False
            l += 1
            r -= 1
        return True


if __name__ == "__main__":
    string = "A man, a plan, a canal: Panama"
    print (string)
    print (Solution().isPalindrome(string))

    string2 =  "race a car"
    print (string2)
    print (Solution().isPalindrome(string2))

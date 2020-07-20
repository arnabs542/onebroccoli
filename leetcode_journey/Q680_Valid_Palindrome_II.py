"""


Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
"""


class Solution(object):
    def validPalindrome2(self,s):
        """
        
        :param s: str
        :return: true or false
        """
        """
        go through the whole string, construct the new string by 
        removing one character,check if it is palindrome
        not very efficient:
        Time: O(N^2)
        Space: O(N)
        """

        for i in range(len(s)):
            t = s[:i] + s[i+1:]
            if t == t[::-1]:
                return True
        return s == s[::-1]

    """
    被删除的charater 左边必须和最右边是回环数
    if s[l] != s[r]
        check (s[l+1,r]) #delete s[l]
        check (s[l,r-1]) #delete s[r]
    """
    def validPalindrome(self,s):
        l = 0
        r = len(s) -1
        while l < r:
            if s[l] != s[r]:

                return self.isPalindrome(s,l+1, r) or  self.isPalindrome(s, l, r-1)
            l += 1
            r -= 1

        return True

    def isPalindrome(self,s,l, r):
        #corner case: if l+=1 r -=1, there is only one letter left, then it is palindrome.
        if l == r:
            return True
        else:
            result = s[l:r+1] #need to refer to the right string r+1 !!
            if result == result[::-1]:
                return True
        return False


if __name__ == "__main__":

    string = "abc"
    print (string)
    print (Solution().validPalindrome(string))

    string2 = 'abca'
    print (string2)
    print (Solution().validPalindrome(string2))





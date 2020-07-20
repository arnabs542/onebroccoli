"""
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
"""

"""
Solution
 
 {
Use empty array as sum
set pointers for each string (len(num1)-1, len(num2)-1)
loop over strings from end to beginning using i, j
stop when both strings are used entirely
compute the current value 
update the carry
append to the result
at the end reverse the string , use '1'* carry (if carry = 0 then nothing got appended, 
if carry = 1 then add 1 in the front
}


Time: O(max(N1,N2)) max length of num1 and num2
Space: O(max(N1,N2)) : length of new string at most max (n1,n2)+1
"""

class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        sum = ''
        i, j = len(num1) - 1, len(num2) - 1
        carry = 0
        while i >= 0 or j >= 0:
            carry += ord(num1[i]) - ord('0') if i >=0 else 0
            carry += ord(num2[j]) - ord('0') if j >=0 else 0
            sum += str(carry%10)
            print (sum)
            carry //= 10

            i -= 1
            j -= 1
            print (sum[::-1])
        return '1'*carry + sum[::-1]

if __name__ =="__main__":
    n1 = '392'
    n2 = '345'
    print ('n1=', n1, 'n2 = ',n2)
    print (Solution().addStrings(n1,n2))
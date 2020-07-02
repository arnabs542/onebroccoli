"""
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
"pwke" is a subsequence and not a substring.

http://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
"""


class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        start = maxLength = 0
        usedChar = {}
        
        for i in range(len(s)):
            if s[i] in usedChar and start <= usedChar[s[i]]:             
                start = usedChar[s[i]] + 1
            else:
                maxLength = max(maxLength, i - start + 1)
            usedChar[s[i]] = i
        return maxLength


print Solution().lengthOfLongestSubstring('abcabd')




#
#class Solution(object):
#    def lengthOfLongestSubstring(self, s):
#        """
#        :type s: str
#        :rtype: int
#        """
#        start = maxLength = 0
#        usedChar = {}
#        
#        for i in range(len(s)):
#            print 'i=',i
#            if s[i] in usedChar and start <= usedChar[s[i]]:
#                print s[i],'in usedchar and start',start,'<= usedChar[s[',i,']]'                
#                start = usedChar[s[i]] + 1
#                print 'start=',start
#            else:
#                print 'other'
#                maxLength = max(maxLength, i - start + 1)
#                print 'other','maxLength=',maxLength
#            usedChar[s[i]] = i
#            print 'usedChar[s[i]]',s[i],'=',i
#            print 'maxLength=',maxLength
#        return maxLength
#        print 'maxLength',maxLength
#print Solution().lengthOfLongestSubstring('abcabd')

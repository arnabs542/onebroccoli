import unittest

# -*- coding: utf-8 -*-
"""
Created on Mon Mar 27 20:31:37 2017

@author: Sophia
"""
"""
15. 3Sum
Given an array S of n integers, are there elements a, b, c in S such that 
a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

"""
"""
Solution:
(a<=b<=c)

1. sorting
time O(N^2)
space O(N)
"""



class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        n = len(nums)
        res = []
        nums.sort()
        if n < 3:
            return []
        
        for i in range(n - 2):
            if i == 0 or nums[i] != nums[i - 1]:
                left = i + 1
                right = len(nums) - 1
                while left < right:
                    sum = nums[left] + nums[right] + nums[i]
                    if sum == 0:
                        res.append([nums[i], nums[left], nums[right]])
                        left += 1
                        right -= 1

                        while left < right and nums[left] == nums[left - 1]:
                            left += 1
                        while left < right and nums[right] == nums[right + 1]:
                            right -= 1

                    elif sum > 0:
                        right -= 1
                    else:
                        left += 1

        return res


class TestSolution(unittest.TestCase):

    def test_3sum(self):
        a = [1,1,-2,-3,-1,4]
        ans = [[-3,-1,4],[-2,1,1]]
        self.assertEqual(Solution().threeSum(a), ans, 'incorrect')

    def test_3sum2(self):
        a = [-2,0,0,2,2]
        ans = [[-2, 0,2]]
        self.assertEqual(Solution().threeSum(a), ans, 'incorrect')
    def test_3sum3(self):
        a = [0,0,0]
        ans = [[0, 0, 0]]
        self.assertEqual(Solution().threeSum(a), ans, 'incorrect')

if __name__ == "__main__":
    unittest.main()

                
                
                
                
                
                
                
                
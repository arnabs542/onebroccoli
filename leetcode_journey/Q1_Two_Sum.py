# -*- coding: utf-8 -*-
"""
Created on Mon Jan 30 16:30:19 2017

@author: Sophia
"""
#
#1. Two Sum
#Given an array of integers, return indices of the two numbers such that
#they add up to a specific target.
#
#You may assume that each input would have exactly one solution.
#
#Example:
#Given nums = [2, 7, 11, 15], target = 9,
#
#Because nums[0] + nums[1] = 2 + 7 = 9,
#return [0, 1].
#UPDATE (2016/2/13):
#The return format had been changed to zero-based indices.
#Please read the above updated description carefully.

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype List[int]
        """
        d = dict()
        for i in range(len(nums)):
            key = target - nums[i]
            if key in d:
                return [d[key],i]
            else:
                d[nums[i]] = i
        return []

#complexity
#time O(n)
#space O(n)

a = [1,2,4,5]
b = 6
if __name__ == '__main__':
    print (Solution().twoSum(a,b))
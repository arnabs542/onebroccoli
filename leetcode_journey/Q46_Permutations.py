"""
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
"""

# from itertools import permutations

class Solution(object):
    # #use existing module
    # def permute1(self,nums):
    #     return permutations(nums)


#recursion:
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) == 0:
            return []

        if len(nums) ==1 :
            return [nums]
        answer = []
        for i, num in enumerate(nums):
            rest = nums[:i] + nums[i+1:]
            for y in self.permute(rest):
                answer.append([num] + y)

        return answer

#

if __name__ == "__main__":
    a = [1,2,3]
    print (Solution().permute(a))
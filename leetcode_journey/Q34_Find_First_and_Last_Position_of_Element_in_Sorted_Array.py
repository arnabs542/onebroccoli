"""

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
nums is a non decreasing array.
-10^9 <= target <= 10^9
"""

"""
Solution:
binary search will have O(logn) time complexity
nums[mid] <target then lower_bound move to left, 
nums]mid]<=target then lower_bound move to right
space : O(1)

although there are two binary search manipulations, its time complexity is still O(2logn) = O(logn) 
if n denotes to length of nums
"""

class Solution(object):
    def searchRange(self,nums, target):
        """
        
        :param nums: List[int]
        :param target: int
        :return: List[int]
        """
        if len(nums) == 0:
            return [-1, -1]
        result = []
        #do binary search first time to find left boundary
        left, right = 0, len(nums) - 1
        while left + 1 < right:
            mid = left + (right - left) // 2
            print ('mid:' + str(mid))

            if nums[mid] < target:
                left = mid
            else:
                right = mid
            print ('left = '+str(left)+'and right = ' + str(right))

        #target not found:
        if nums[left] != target and nums[right] != target:
            return [-1, -1]

        result.append(left if nums[left] == target else right)

        #do binary search second time to find right boundary
        left, right = 0, len(nums) -1
        while left + 1 < right:
            mid = left + (right - left) // 2
            if nums[mid] > target:
                right = mid
            else:
                left = mid

        result.append(right if nums[right] == target else left)

        return result

if __name__ == '__main__':
    a1 = [5,7,7,8,8,8]
    a2 = 8
    print (Solution().searchRange(a1,a2))

    b1 = [5,7,7,8,8,10]
    b2 = 6
    print (Solution().searchRange(b1,b2))

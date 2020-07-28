"""
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
"""

"""
input = [5,4,3,2,1] already largest, then give the smallest
output = [1,2,3,4,5]


input = [1,2,7,9,6,4,1]
output= [1,2,9,7,6,4,1] #find 7,9 ,swap them 
output= [1,2,9,1,4,6,7] ascending 7,6,4,1 to the lowest number

input = [1,7,9,9,8,3]
output =[1,7,3,8,9,9] 1,7, ( sort 9,9,8,3) then swap 7 and 8
output = [1,8,3,7,9,9] next greater permutation

first iterate see when you stop ascending, reverse the ascending element, 
then iterate one more time to find the number just greater than the number you stepped at originally.
"""





"""
Time: O(N) iterate three times: iterate to find the first non-ascending number, 2nd in reverse function, 
3rd to find the number to swap out for the first not ascending number?
Space: O(1) constance extra space

"""


class Solution(object):
    def swap(self,nums, ind1, ind2):
        temp = nums[ind1]
        nums[ind1] = nums[ind2]
        nums[ind2] = temp
    def reverse(self, nums, beg, end):
        while beg< end:
            self.swap(nums, beg, end)
            beg += 1
            end -= 1



    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        if len(nums) == 1:
            return
        if len(nums) == 2:
            return self.swap(nums, 0, 1)
        dec = len(nums) -2
        while dec >= 0 and nums[dec] >= nums[dec+1]:
            dec -= 1
        self.reverse(nums, dec+1, len(nums) - 1)
        if dec == -1:
            return
        next_num = dec+1
        while next_num < len(nums) and nums[next_num] <= nums[dec]:
            next_num += 1
        self.swap(nums, next_num, dec)
        return nums

if __name__ == "__main__":
    n1 = [1,7,9,9,8,3]
    print ('input: ' + str(n1))
    print ('output:'+str(Solution().nextPermutation(n1)))

    n2 = [1,2,7,9,6,4,1]
    print ('input: ' + str(n2))
    print ('output:'+str(Solution().nextPermutation(n2)))
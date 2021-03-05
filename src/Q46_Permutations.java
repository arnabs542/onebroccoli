/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]


Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
 */

import java.util.List;
import java.util.ArrayList;
public class Q46_Permutations {
    public List<String> permutations(String set){
        List<String> result = new ArrayList<String>();
        //sanity check
        if (set == null){
            return result;
        }
        char[] array = set.toCharArray();
        swap(array, 0, result);
        return result;
    }

    //choose the character to be at the position of "Index"
    //all the already chosen positions are (0, index - 1)
    //all the candidate characters can be at position "index"
    //are in the subarray of (index, array.length-1)
    private void helper(char[] array, int index,  List<String> result){
        //terminate condition:
        //only when we have already chosen the characters for all the positions,
        //we can have a complete permutation
        if (index == array.length){
            result.add(new String(array));
            return;
        }
        //all the possible characters could be placed at index are
        //the characters in the subarray (index, array.length-1)
        for (int i = index; i < array.length; i++){
            swap(array, index, i);
            helper(array, index + 1, result);
            //remember to swap back when back track to previou level
            swap(array, index, 1);
        }
    }

    private void swap(char[] array, int left, int right){
        char tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;

    }

}

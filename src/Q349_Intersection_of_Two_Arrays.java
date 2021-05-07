import java.util.Arrays;
import java.util.HashSet;

/*
349. Intersection of Two Arrays Leetcode
651. Common Numbers Of Two Arrays II(Array version) LAI
Find all numbers that appear in both of two unsorted arrays.

Assumptions

Both of the two arrays are not null.
In any of the two arrays, there could be duplicate numbers.
Examples

A = {1, 2, 3, 2}, B = {3, 4, 2, 2, 2}, return [2, 2, 3] (there are both two 2s in A and B)



 */


public class Q349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1){
            set1.add(n);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2){
            set2.add(n);
        }
        if (set1.size() < set2.size()){
            return set_intersection(set1, set2);
        } else {
            return set_intersection(set2, set1);
        }
    }

    private int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2){
        //assum set1 is always smaller than size 2
        int[] result = new int[set1.size()];
        int index = 0;
        for (Integer s : set1){
            if (set2.contains(s)){
                result[index++] = s;
            }
        }
        return Arrays.copyOf(result, index);

    }
}

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */
public class Q54_Spiral_Matrix {
    public List<Integer> spiral(int[][] matrix) {
        //base case: only 0, 1 element left
        List<Integer> result = new ArrayList<Integer>();
        recursiveTraverse(matrix, 0, matrix.length, result);
        return result;
    }

    private void recursiveTraverse(int[][] matrix, int offset, int size, List<Integer> result) {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            result.add(matrix[offset][offset]);
            return;
        }
        //size -1 because only point to size - 1 number for each side
        for (int i = 0; i < size - 1; i++) {
            result.add(matrix[offset][offset + i]); // go right
        }
        for (int i = 0; i < size - 1; i++) {
            result.add(matrix[offset + i][offset + size - 1]); //go down
        }
        for (int i = size - 1; i >= 1; i--) {
            result.add(matrix[offset + size - 1][offset + i]); //go left
        }
        for (int i = size - 1; i >= 1; i--) {
            result.add(matrix[offset + i][offset]);//go up
        }
        recursiveTraverse(matrix, offset + 1, size - 2, result);
    }

    public static void main(String[] args){
        Q54_Spiral_Matrix s = new Q54_Spiral_Matrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = s.spiral(matrix);
        System.out.println(result);
    }

}

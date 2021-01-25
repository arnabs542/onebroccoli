import java.util.Arrays;

public class mergeSort {
    public int[] mergeSort2(int[] array){
        //corner case
        if (array == null || array.length == 0){
            return array;
        }
        return mergeSort2(array, 0, array.length - 1);
    }
    private int[] mergeSort2(int[] array, int left, int right){
        //base case
        if (left == right){
            return new int[] {array[left]};
        }
        //recursion rule
        int mid = left + (right - left) / 2;
        //[left, mid], [mid + 1, right]
        int[] leftArray = mergeSort2(array, left, mid);
        int[] rightArray = mergeSort2(array, mid + 1, right);
        return merge(leftArray, rightArray);
    }
    private int[] merge(int[] leftArray, int[] rightArray){
        int[] result = new int[leftArray.length + rightArray.length];

        int i = 0; //top of left array
        int j = 0; //top of right arrray;
        int k = 0; //result position;
        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] < rightArray[k]){
                result[k] = leftArray[i];
                i++;
            } else { //leftArray[i] >= rightArray[k]
                result[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //while 退出case
        //case1: left array is empty
        //case2: right array is empty
        //不存在case 3: both are empty -->IMPOSSIBLE
        while (j < rightArray.length){
            result[k] = rightArray[j];
            j++;
            k++;
        }
        while (i < leftArray.length){
            result[k] = rightArray[i];
            i++;
            k++;
        }
        return result;
    }
    public static void main(String[] args){
        int[] a = {5,2,7,4,1,3,9,6};
        mergeSort solution = new mergeSort();
        System.out.println(Arrays.toString(solution.mergeSort2(a)));
    }
}

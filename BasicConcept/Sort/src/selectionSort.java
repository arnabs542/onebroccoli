import java.util.Arrays;

public class selectionSort {
    public int[] selectionSort2(int[] array) {
        //corner case
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
        return array;
    }

    private void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 7, 4, 1, 3, 8, 6};
        selectionSort solution = new selectionSort();
        System.out.println(Arrays.toString(solution.selectionSort2(a)));
    }
}


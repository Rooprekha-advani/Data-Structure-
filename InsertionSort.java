import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int current = array[i];  
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j]; 
                j--;
            }

            array[j + 1] = current;    }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};  

        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }
}

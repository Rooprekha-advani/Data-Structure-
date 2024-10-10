import java.util.Arrays;

public class SortingFour {
    public static void sortFour(int[] arr) {
        if (arr[0] > arr[1]) {
            swap(arr, 0, 1);
        }
        
        if (arr[2] > arr[3]) {
            swap(arr, 2, 3);
        }

        if (arr[0] > arr[2]) {
            swap(arr, 0, 2);
        }

        if (arr[1] > arr[3]) {
            swap(arr, 1, 3);
        }

        // Final comparison to sort the middle two elements
        if (arr[1] > arr[2]) {
            swap(arr, 1, 2);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 7};  

        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        sortFour(numbers);

        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }
}

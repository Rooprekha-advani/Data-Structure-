import java.util.Arrays;

public class IterativeMergeSort {
    
    // Function to perform iterative merge sort
    public void mergeSort(int[] arr) {
        int n = arr.length;

        // Start with subarrays of size 1, and double the size in each iteration
        for (int currSize = 1; currSize < n; currSize *= 2) {
            // Merge subarrays in pairs
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                // Calculate mid and right end
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                // Merge the subarrays
                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    // Helper function to merge two sorted subarrays
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main method to test the iterative merge sort
    public static void main(String[] args) {
        IterativeMergeSort ims = new IterativeMergeSort();
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        ims.mergeSort(arr);
        
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}

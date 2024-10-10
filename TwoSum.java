import java.util.Arrays;

public class TwoSum {

    // Function to check if there are two numbers that sum up to K
    public static boolean findTwoSum(int[] arr, int K) {
        // Sort the array (O(N log N) time complexity)
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];

            if (sum == K) {
                return true;  
            } else if (sum < K) {
                left++; 
            } else {
                right--;  
            }
        }

        return false;  
    }

    public static void main(String[] args) {
        int[] numbers = {8, 4, 1, 6};  
        int K = 10; 

        if (findTwoSum(numbers, K)) {
            System.out.println("Yes, there are two numbers that sum up to " + K);
        } else {
            System.out.println("No, there are no two numbers that sum up to " + K);
        }
    }
}

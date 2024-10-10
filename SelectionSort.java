public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
                if ( arr[minIndex] > arr[j]) {
                    minIndex = j; //updation 
                }
            }
            int temp = arr[i];
            arr[i] =  arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr);
        System.out.println(" ");
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






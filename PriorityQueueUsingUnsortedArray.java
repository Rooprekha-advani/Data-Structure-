class PriorityQueueUsingUnsortedArray {
    private int[] array; 
    private int size;    

 
    public PriorityQueueUsingUnsortedArray(int capacity) {
        array = new int[capacity]; 
        size = 0; 
    }

   
 public void insert(int data) {
        if (size < array.length) {
            array[size] = data;
            size++;           
        }
    }
   
    public int extractMax() {
        if (size == 0) {
            return -1; 
        }

        int maxIndex = 0;
       
        for (int i = 1; i < size; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;     }
        }

        int maxValue = array[maxIndex]; 
        for (int i = maxIndex; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--; 
        return maxValue;
    }


    public int getMax() {
        if (size == 0) {
            return -1; 
        }
        int max = array[0]; // Assume the first element is the max
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    
    public boolean searchData(int data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false; 
    }

    // print the queue
    public void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueUsingUnsortedArray pq = new PriorityQueueUsingUnsortedArray(10);

        pq.insert(5);
        pq.insert(10);
        pq.insert(3);
        pq.insert(8);

        System.out.println("Queue after insertion:");
        pq.printQueue();

        int max = pq.extractMax();
        if (max != -1) {
            System.out.println("Extracted max: " + max);
        } else {
            System.out.println("Queue is empty. Cannot extract.");
        }

        System.out.println("Queue after extraction:");
        pq.printQueue();


        System.out.println("Max value in the queue: " + pq.getMax());
        System.out.println("Is 3 in the queue? " + pq.searchData(3));
        System.out.println("Is 15 in the queue? " + pq.searchData(15));
    }
}

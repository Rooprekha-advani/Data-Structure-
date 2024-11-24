class PriorityQueueUsingSortedArray {
    private int[] array; 
    private int size;    

    // Constructor
    public PriorityQueueUsingSortedArray(int capacity) {
        array = new int[capacity]; 
        size = 0; 
    }

    // Method to insert data into the priority queue but in Decending order
   /* public void insert(int data) {
        if (size < array.length) {
            int i = size - 1;

            // Shift elements to maintain sorted order
            while (i >= 0 && array[i] < data) {
                array[i + 1] = array[i];
                i--;
            }

            array[i + 1] = data; 
            size++;
        }
    }*/


    //Ascending Order
    public void insert(int data) {
        if (size < array.length) {
            int i = size - 1;
    
            // Shift elements to maintain ascending order
            while (i >= 0 && array[i] > data) {
                array[i + 1] = array[i];
                i--;
            }
    
            array[i + 1] = data; 
            size++;
        }
    }
    

    // Method to extract the maximum value (and remove it)
    public int extractMax() {
        if (size == 0) {
            return -1; 
        }

        int maxValue = array[size - 1]; 
        size--; 
        return maxValue;
    }

    //print the queue 
    public void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;    }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getMax() {
        if (size == 0) {
            return -1; 
        }
        return array[size - 1]; 
    }

    public static void main(String[] args) {
        PriorityQueueUsingSortedArray pq = new PriorityQueueUsingSortedArray(10);

        pq.insert(5);
        pq.insert(10);
        pq.insert(3);
        pq.insert(8);

        System.out.println("Queue after insertion:");
        pq.printQueue();

        System.out.println("Extracted max: " + pq.extractMax());

        System.out.println("Queue after extraction:");
        pq.printQueue();


        System.out.println("Max value in the queue: " + pq.getMax());
    }
}

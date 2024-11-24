class PriorityQueueUsingBinaryHeapinArray {
    private int[] heap; 
    private int size;   
    private int MaximumSize; 

    // Constructor
    public PriorityQueueUsingBinaryHeapinArray(int MaximumSize) {
        this.MaximumSize = MaximumSize;
        heap = new int[MaximumSize];
        size = 0;
    }
 
    public void insert(int data) {
        if (size < MaximumSize) {
            heap[size] = data; 
            shiftUp(size);     
            size++;     }
    }

    //going upwards
    private void shiftUp(int index) {
        int parent = (index - 1) / 2;
        while (index > 0 && heap[index] > heap[parent]) {
            // Swap child and parent if child is greater
            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;

            index = parent;
            parent = (index - 1) / 2;
        }
    }

    //going downwards
    private void shiftDown(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // Check if the left child is larger
        if (leftChild < size && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        // Check if the right child is larger
        if (rightChild < size && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        // If the largest is not the current index, swap and recurse
        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            shiftDown(largest);
        }
    }

   
    public void remove(int index) {
        if (index >= size) {
            return; 
        }

        heap[index] = heap[size - 1]; // Replace the element with the last element
        size--; 
        shiftDown(index); 
    }

    public int extractMax() {
        if (size == 0) {
            return -1; 
        }

        int max = heap[0]; // The root is the max value
        heap[0] = heap[size - 1]; // Replace the root with the last element
        size--; 
        shiftDown(0); 
        return max;
    }

    // Print the heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueUsingBinaryHeapinArray pq = new PriorityQueueUsingBinaryHeapinArray(10);

        pq.insert(5);
        pq.insert(10);
        pq.insert(3);
        pq.insert(8);

        System.out.println("Heap after insertion:");
        pq.printHeap();

        System.out.println("Extracted max: " + pq.extractMax());
        System.out.println("Heap after extraction:");
        pq.printHeap();

        pq.remove(1); // Remove the second element
        System.out.println("Heap after removal:");
        pq.printHeap();
    }
}




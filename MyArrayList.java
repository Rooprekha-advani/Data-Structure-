public class MyArrayList<T> {
    private T[] asArray; // The array to hold elements
    private int size;    // Tracks the number of elements in the list

    // Constructor to initialize the array and size
    public MyArrayList() {
        asArray = (T[]) new Object[10]; // Start with a capacity of 10
        size = 0;                       // Initially, the list is empty
    }

    // Appends the element to the end of the list
    public void add(T value) {
        ensureCapacity();          // Make sure there's enough space
        asArray[size] = value;     // Add the value at the current size index
        size++;                    // Increment the size
    }

    // Inserts the element at the specified index
    public void insert(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        ensureCapacity();          // Ensure enough space
        // Shift elements to the right to make space
        for (int i = size; i > index; i--) {
            asArray[i] = asArray[i - 1];
        }
        asArray[index] = value;    // Insert the new value
        size++;                    // Increment size
    }

    // Removes the element at the specified index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            asArray[i] = asArray[i + 1];
        }
        asArray[size - 1] = null; // Nullify the last element
        size--;                   // Decrease the size
    }

    // Ensure the array has enough capacity
    private void ensureCapacity() {
        if (size == asArray.length) { // Check if resizing is needed
            T[] newArray = (T[]) new Object[asArray.length * 2]; // Double the size
            System.arraycopy(asArray, 0, newArray, 0, size);     // Copy elements
            asArray = newArray;                                 // Use the new array
        }
    }

    // Returns the current size of the list
    public int size() {
        return size;
    }

    // Get the element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return asArray[index];
    }
}

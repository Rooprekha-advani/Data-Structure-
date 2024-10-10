class QueueUsingArray {
    int arr[]; 
    int read; 
     int write; 
     int capacity; 
     int count; 
     int size;
 
    // Constructor to initialize queue   
    QueueUsingArray(int size) 
    { 
        arr = new int[size]; 
        capacity = size; 
        read = 0; 
        write = 0; 
        count = 0; 
        size =0;
    } 

    public void enqueue(int item)  { 
          arr[write] = item;
          write = write + 1;
          System.out.println("item is" +" "+ item );
          size ++; 
    }

    public int dequeue() 
    { 
          int k = arr [read];
          read = read + 1;
          size --;
          return k;
    } 

    public int peek()   { 
        return arr[read];
    } 

    public int size()  { 
        return read +1;
    } 

    public Boolean isEmpty()    { 
        if ( size < arr.length){
            return true;
        }
        else  {
            return false;      }
    } 

    public Boolean isFull()  { 
         if (size == arr.length) {
            return true;
         }
         else {
            return false;
         }
    } 

    // main function   
    public static void main (String[] args) 
    { 
        // create a queue of capacity 5   
        QueueUsingArray q = new QueueUsingArray(5); 
 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 

        System.out.println("Front element is: " + q.peek()); 
        System.out.println("remove item " + q.dequeue()); 
        System.out.println("Front element is: " + q.peek()); 
        System.out.println("Queue size is " + q.size()); 

        System.out.println("remove item " + q.dequeue()); 
        System.out.println("remove item " + q.dequeue()); 
    
        if (q.isEmpty()) 
            System.out.println("Queue Is Empty"); 
        else 
            System.out.println("Queue Is Not Empty"); 

            System.out.println(q.isFull()) ;
}
}
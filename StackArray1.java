public class StackArray1{
 private int arr[];
private  int top;
 private int capacity;
 
 // Constructor to initialize stack
 StackArray1(int size)
 {
 arr = new int[size];
 capacity = size;
 top = -1;
 }

 // Utility function to add an element x in the stack and check for stack overflow
 public int push(int x)  {
 if ( top == -5)
 {
    System.out.println("full");
    return 0;
 }
 else 
 {
   return arr [++ top ] = x;  }
 }

 // Utility function to pop top element from the stack and check for stack underflow
public int pop ()
{
if ( top == -1)        {
    System.out.println("empty");
    return -1;
}
else {
    return arr[top --] ;
    }
}

// Utility function to return top element in a stack
public int top()       {
  return arr [top];
}

// Utility function to return the size of the stack
public int size()    {
  return top +1;
}

// Utility function to check if the stack is empty or not
public Boolean isEmpty()
{
    if ( top < arr.length) {
        return true;
    }
    else {
        return false;  }
  
}
// Utility function to check if the stack is full or not
public boolean isFull()
{
   if ( top == arr.length){
    return true;
   }
   else         {
  return false;       }
}



 public static void main (String[] args)
 {
 StackArray1 stack = new StackArray1(3);
 System.out.println("insert" + stack.push(1)) ; // Inserting 1 in the stack
 System.out.println("insert" + stack.push(2)) ; // Inserting 2 in the stack
 
 System.out.println("remove" + stack.pop()) ; // removing the top 2
 System.out.println("remove" + stack.pop()) ; // removing the top 1

 System.out.println("insert" + stack.push(3)) ; // Inserting 3 in the stack

 System.out.println("Top element is: " + stack.top());
System.out.println("Stack size is " + stack.size());

System.out.println("remove" + stack.pop()) ; // removing the top 3
 // check if stack is empty
 if (stack.isEmpty())
 System.out.println("Stack Is Empty");
 else
 System.out.println("Stack Is Not Empty");         }

}


import java.util.Scanner;
class Recursion 
{
    public static void recursion (int n)
    {
         if (n <= 0)
         {
            return;
         }
        
            System.out.println(n);
            recursion (n -1);
            
            
         
    }


    public static void main (String args [])
    {
      Scanner s = new Scanner (System.in);
      System.out.println("enter number ");
      int n1 = s.nextInt();
      recursion(n1);
    }
}
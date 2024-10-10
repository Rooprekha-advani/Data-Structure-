import java.util.Scanner;
public class fib {
    
    public static int fibonacciSeries (int n)
    {
        if ( n ==0 || n==1)
        return 1 ;
        else
        {
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
    public static void main (String args [])
    {
       fib f = new fib();
       Scanner s = new Scanner (System.in);
       System.out.println("enter numbers");
       int n1= s.nextInt();
       for (int i =0; i< n1; i++)
       {
        System.out.println(f.fibonacciSeries(i));
       }
       System.out.println();
       
    }
}

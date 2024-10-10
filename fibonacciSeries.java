public class fibonacciSeries
{
    public void fibo (int a, int b, int n)
    {
      if (n < 0)
      return;

      else{
        for (int i =0; i<6; i++)
        {

        System.out.println(a + " ");
        int next = a +b;
        a=b;
        b= next;
        }
          }
    }
    public static void main (String args [])
    {
        fibonacciSeries f = new fibonacciSeries();
        f.fibo(0,1,6);

    }
}
public class Recursion2 {

    void RecursionCharacter (char [] array, int index)
        {
            if (index == array.length)
            {
                return;
            }
            System.out.println(array[index] + " ");
            RecursionCharacter(array, index +1);
            System.out.println();
            System.out.print(array[index] + " ");
        }
    public static void main (String args [])
    {
        Recursion2 r = new Recursion2();
        char [] array = {'a','e', 'i','o','u'};
        System.out.println();
        r.RecursionCharacter(array, 0);
        
    }
}

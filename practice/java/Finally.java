public class Finally {
    public static void main(String args[])
    {
        try
        {
            int number=10/0;
            System.out.println(number);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number can not be divided with zero!");
        }
        finally
        {
            System.out.println("This is finally block.");
        }
        System.out.println("All blocks are executed.");
    }
}

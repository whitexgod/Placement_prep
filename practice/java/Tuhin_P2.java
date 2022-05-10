
public class Tuhin_P2 {
    public static void main(String args[])
    {
        try{
            int a[]=new int[3];
            int b=0;
            a[0]=1;
            a[1]=2;
            //a[2]=3/b; //number is being divided by zero
            //a[3]=4; //array index out of bound here
            for(int i=0;i<3;i++)
            {
                System.out.println(a[i]);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide a number by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
        catch (Exception e)
        {
            System.out.println("An unexpected situation has happended!");
        }
    }
}

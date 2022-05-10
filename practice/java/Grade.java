interface grade
{
    final int O = 90;
    final int E = 80;
    final int A = 70;
    final int B = 60;
    final int C = 50;
    final int D = 40;
}
class A implements grade{

    int sub1=85;
    int sub2=90;
    int sub3=45;

    public void result()
    {
        int avg = (sub1+sub2+sub3)/3;

        if(avg>=O)
        {
            System.out.println("Grade : O");
        }
        else if((avg>=E) && (avg<O))
        {
            System.out.println("Grade : E");
        }
        else if((avg>=A) && (avg<E))
        {
            System.out.println("Grade : A");
        }
        else if((avg>=B) && (avg<A))
        {
            System.out.println("Grade : B");
        }
        else if((avg>=C) && (avg<B))
        {
            System.out.println("Grade : C");
        }
        else if((avg>=D) && (avg<C))
        {
            System.out.println("Grade : D");
        }
        else
        {
            System.out.println("Grade : F");
        }
    }
}
class Grade implements grade
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.result();
    }
}
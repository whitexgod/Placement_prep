import java.lang.*;

interface boy
{
    void show_boy();
}
interface girl
{
    void show_girl();
}
class Interface1 implements boy,girl{
    public void show_boy()
    {
        System.out.println("I am boy interface!");
    }
    public void show_girl()
    {
        System.out.println("I am girl interface!");
    }

    public static void main(String args[])
    {
        Interface1 I1 = new Interface1();
        I1.show_boy();
        I1.show_girl();
    }
}
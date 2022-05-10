interface C
{
    void show();
    void show_C();
}
interface D 
{
    void show();
    void show_D();
}
abstract class B
{
    abstract void show();
    abstract void show_B();
}

class A extends B implements C,D
{
    public void show()
    {
        System.out.println("Common show method is called!");
    }
    public void show_C()
    {
        System.out.println("I am C. I am being called!");
    }
    public void show_D()
    {
        System.out.println("I am D. I am being called!");
    }
    public void show_B()
    {
        System.out.println("I am B. I am being called!");
    }
    public void show_A()
    {
        System.out.println("I am A. I am being called!");
    }
}

class Abstraction_drama 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();
        obj.show_A();
        obj.show_B();
        obj.show_C();
        obj.show_D();
    }
}
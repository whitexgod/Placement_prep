import java.lang.*;
import java.util.*;

abstract class demo
{
    abstract void show();
}
class Abstract_class1 extends demo
{
    void show()
    {
        System.out.println("Rewriting Abstract class!");
    }
    public static void main(String args[])
    {
        demo D;
        D = new Abstract_class1();
        D.show();
    }
}
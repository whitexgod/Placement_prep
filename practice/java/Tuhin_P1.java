package Tuhin_Mukherjee_call;

import Tuhin_Mukherjee.*;
class Tuhin_P1 extends Tuhin_class2
{
    public static void main(String args[])
    {
        Tuhin_class1 obj1 = new Tuhin_class1();
        Tuhin_class2 obj2 = new Tuhin_class2();
        Tuhin_P1 obj3 = new Tuhin_P1();

        //obj1.Box1_Mukherjee();//   Public method is accessible anywhere.
        //obj1.Box2_Mukherjee(); //  Private method can not be accessed from
        //                           different package subclass.
        //obj3.Box3_Mukherjee(); //  Protected method can be accessed through subclass.
        obj2.Box4_Mukherjee();     //Default method can not be accessed from
        //                           different package subclass.
    }
}
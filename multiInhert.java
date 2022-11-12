package com.company;
class A{
    public void a1()
    {
        System.out.println(" This is Method in class A");

    }
}
class B extends A  {
    public void a2()
    {
        System.out.println(" This is Method in class B");

    }
}
class C extends B {
    public void a3()
    {
        System.out.println(" This is Method in class C");

    }
}

public class multiInhert {
    public static void main(String args[])
    {
        C obj=new C();
        obj.a1();
        obj.a2();
        obj.a3();
    }
// So this is multilevel inheritance :)
}

package com.company;
class Myclass
{
    int a;
    int b;
    public static void meth()
    {
        System.out.println("This is my method in the class");

    }
    public static void  multi(int a,int b)
    {

        System.out.println("This is Multiplication :" + a*b);

    }

}

public class Class1 {
    public static void main(String args[])

    {
        Myclass obj= new Myclass();
        obj.multi(8,9);
        obj.meth();
    }



}

package com.company;

public class Methods {
    public static void mymeth1()
    {
        System.out.println("Hii this is my method");
    }
    public static int mymeth2(int a,int b)
    {
        int add;
        add= a+b;
        return add;
    }

    public static void main(String[] args) {
        mymeth1();
       int  addi= mymeth2(5,6);
        System.out.println(addi);


    }
}

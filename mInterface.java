package com.company;
interface  myinterface1
{
    public static void add(int a,int b){

    }
    public static void sub(int a,int b){

    }
}
class A1{
    public static void div(int a,int b)
    {
        int div= a/b;
        System.out.println(div);
    }
    class A2 extends A1 implements myinterface1
    {
        static  void add(int a,int b) {
            int add = a + b;
            System.out.println(add);

        }

    }
}





public class mInterface {
    public static void main(String[] args) {

    }

}

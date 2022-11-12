package com.company;
@FunctionalInterface
interface LambdaExp
{
    void meth(int a,int b);
}

public class lambda {
    public static void main(String[] args) {
        LambdaExp obj=(a,b)->{
            System.out.println("The value of a is " +a +"& b is " +b);
        };
        obj.meth(98,87);

    }

}

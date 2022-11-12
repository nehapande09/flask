package com.company;
class Demo{
    public static void fnc1(int... a)
    {

        for(int element :a){
            System.out.println(element);
        }
        System.out.println("Addition of a given Elements is : "  );


    }

}

public class Var_Args
{
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.fnc1(6,7,8,9,4,5,3,2,10);
    }
}



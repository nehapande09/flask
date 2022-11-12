package com.company;

/**
 * This calss is demonstrate what java class is and how it is used in java industry
 * @author Neha pande
 * @since 2021
 * @version 0.01
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="blank">java docs </a>
 */

public class javadoc {
    public static void add(int a,int b)
    {
        System.out.println("Addition is: "  + a+b);
    }
    public static void multi(int a,int b)
    {
        System.out.println("Multiplication is : " + a*b);
    }
    public static void div(int a,int b)
    {
        System.out.println("Divison  is : " + a/b);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to java doc");
        add(5,6);
        multi(9,7);
        div(760,5);

    }
}
